// mat_q3.java
public class mat_q3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        System.out.println("Matriz 4x4 gerada (produto da linha pela coluna):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}