// q10.java
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        System.out.println("Preencha o vetor X (5 elementos sem repetição):");
        for(int i = 0; i < 5; i++) x[i] = scanner.nextInt();

        System.out.println("Preencha o vetor Y (5 elementos sem repetição):");
        for(int i = 0; i < 5; i++) y[i] = scanner.nextInt();

        // a. Soma
        System.out.print("\na. Soma: ");
        for(int i = 0; i < 5; i++) System.out.print((x[i] + y[i]) + " ");

        // b. Produto
        System.out.print("\nb. Produto: ");
        for(int i = 0; i < 5; i++) System.out.print((x[i] * y[i]) + " ");

        // c. Diferença (Elementos de X que não estão em Y)
        System.out.print("\nc. Diferença (X - Y): ");
        for(int i = 0; i < 5; i++) {
            boolean existeEmY = false;
            for(int j = 0; j < 5; j++) {
                if(x[i] == y[j]) {
                    existeEmY = true;
                    break;
                }
            }
            if(!existeEmY) System.out.print(x[i] + " ");
        }

        // d. Interseção (Elementos em comum)
        System.out.print("\nd. Interseção (X ∩ Y): ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                    break;
                }
            }
        }

        // e. União (Todos de X + Todos de Y que não estão em X)
        System.out.print("\ne. União (X U Y): ");
        for(int i = 0; i < 5; i++) System.out.print(x[i] + " "); // Imprime X primeiro
        for(int i = 0; i < 5; i++) {
            boolean existeEmX = false;
            for(int j = 0; j < 5; j++) {
                if(y[i] == x[j]) {
                    existeEmX = true;
                    break;
                }
            }
            if(!existeEmX) System.out.print(y[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}