// mat_q1.java
import java.util.Scanner;

public class mat_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int contadorMaioresQue10 = 0;

        // Leitura da matriz 4x4
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                // Verifica se o valor é maior que 10
                if(matriz[i][j] > 10) {
                    contadorMaioresQue10++;
                }
            }
        }
        
        System.out.println("A matriz possui " + contadorMaioresQue10 + " valores maiores que 10.");
        scanner.close();
    }
}