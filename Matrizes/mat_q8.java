// mat_q8.java
import java.util.Random;

public class mat_q8 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTransformada = new int[4][4];
        Random rand = new Random();

        System.out.println("Matriz Original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(20) + 1; // Gera números entre 1 e 20
                System.out.print(matriz[i][j] + "\t");
                
                // Aplica a regra da matriz triangular inferior
                if (i < j) {
                    matrizTransformada[i][j] = 0;
                } else {
                    matrizTransformada[i][j] = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transformada (Triangular Inferior):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizTransformada[i][j] + "\t");
            }
            System.out.println();
        }
    }
}