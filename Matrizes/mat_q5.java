// mat_q5.java
import java.util.Scanner;

public class mat_q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("Introduza os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nIntroduza o valor X a pesquisar: ");
        int x = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Valor encontrado na linha " + i + ", coluna " + j + ".");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
        
        scanner.close();
    }
}