// mat_q7.java
import java.util.Scanner;

public class mat_q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaAcima = 0, somaAbaixo = 0, somaPrincipal = 0, somaSecundaria = 0;

        System.out.println("Introduza os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                
                if (i < j) somaAcima += matriz[i][j];
                if (i > j) somaAbaixo += matriz[i][j];
                if (i == j) somaPrincipal += matriz[i][j];
                // Condição para a diagonal secundária numa matriz de dimensão n (i + j == n - 1)
                if (i + j == 2) somaSecundaria += matriz[i][j]; 
            }
        }

        System.out.println("Soma acima da diagonal principal: " + somaAcima);
        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixo);
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        
        scanner.close();
    }
}