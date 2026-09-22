import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] V = new double[10];
        int n = 10;
        double soma = 0;

        System.out.println("Digite os 10 valores do vetor V:");
        for(int i = 0; i < n; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            V[i] = scanner.nextDouble();
            soma += V[i];
        }

        // 1. Calcular a média (m)
        double m = soma / n;

        // 2. Calcular o somatório do quadrado das diferenças: (V[i] - m)²
        double somatorioDiferencas = 0;
        for(int i = 0; i < n; i++) {
            somatorioDiferencas += Math.pow((V[i] - m), 2);
        }

        // 3. Aplicar a fórmula do desvio padrão
        double desvioPadrao = Math.sqrt(somatorioDiferencas / (n - 1));

        System.out.printf("\nMédia: %.2f\n", m);
        System.out.printf("Desvio Padrão: %.4f\n", desvioPadrao);
        
        scanner.close();
    }
}