// mat_q9.java
import java.util.Random;

public class mat_q9 {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        boolean[] sorteados = new boolean[100]; // Controla quais números já foram usados (0 a 99)
        Random rand = new Random();

        System.out.println("Cartela de Bingo Gerada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;
                
                do {
                    numero = rand.nextInt(100);
                } while (sorteados[numero]); // Continua a sortear se o número já estiver na cartela
                
                sorteados[numero] = true;
                cartela[i][j] = numero;
                
                // Formatação para garantir alinhamento (dois dígitos)
                System.out.printf("%02d\t", cartela[i][j]);
            }
            System.out.println();
        }
    }
}