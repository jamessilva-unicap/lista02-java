// q9.java
public class Q9 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int encontrados = 0;
        int numeroAtual = 1; // Assumindo o início dos naturais em 1

        while (encontrados < 100) {
            // Verifica se NÃO é múltiplo de 7 e NÃO termina em 7
            if (numeroAtual % 7 != 0 && numeroAtual % 10 != 7) {
                vetor[encontrados] = numeroAtual;
                encontrados++;
            }
            numeroAtual++;
        }

        System.out.println("Os 100 primeiros naturais que não são múltiplos de 7 nem terminam em 7:");
        for(int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println(); // Quebra de linha a cada 10 números para facilitar a leitura
        }
    }
}