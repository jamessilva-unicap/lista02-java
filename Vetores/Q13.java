import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduza o número de linhas (n) para o Triângulo de Pascal: ");
        int n = scanner.nextInt();
        
        System.out.println("\nTriângulo de Pascal com " + n + " linhas:");
        
        for (int linha = 0; linha < n; linha++) {
            int valor = 1;
            
            for (int i = 0; i <= linha; i++) {
                System.out.print(valor + " ");
                
                // O próximo valor na mesma linha é calculado usando o valor atual
                // Esta fórmula evita o uso de fatoriais pesados
                valor = valor * (linha - i) / (i + 1);
            }
            // Quebra de linha no fim de cada linha do triângulo
            System.out.println(); 
        }
        
        scanner.close();
    }
}