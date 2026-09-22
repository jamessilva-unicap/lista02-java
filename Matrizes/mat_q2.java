// mat_q2.java
public class mat_q2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preenchimento da matriz
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j] = 0; // Demais elementos
                }
            }
        }

        // Exibição da matriz
        System.out.println("Matriz 5x5 resultante:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}