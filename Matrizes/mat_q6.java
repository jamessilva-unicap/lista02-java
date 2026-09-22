// mat_q6.java
public class mat_q6 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * (int)Math.pow(i, 2) - 1;
                } else {
                    matriz[i][j] = 4 * (int)Math.pow(i, 3) - 5 * (int)Math.pow(j, 2) + 1;
                }
            }
        }

        System.out.println("Matriz 10x10 Gerada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}