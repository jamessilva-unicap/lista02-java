// mat_q10.java
import java.util.Scanner;

public class mat_q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetorSoma = new int[3];

        System.out.println("Introduza os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                
                // Adiciona o valor à posição correspondente no vetor (que representa a coluna)
                vetorSoma[j] += matriz[i][j];
            }
        }

        System.out.println("\nVetor gerado pela soma das colunas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Coluna " + i + ": " + vetorSoma[i]);
        }
        
        scanner.close();
    }
}