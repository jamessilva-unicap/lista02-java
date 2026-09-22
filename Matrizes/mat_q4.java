// mat_q4.java
import java.util.Scanner;

public class mat_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Introduza os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nO maior valor é " + maiorValor + " e encontra-se na linha " + linhaMaior + ", coluna " + colunaMaior + ".");
        scanner.close();
    }
}