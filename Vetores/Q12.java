// q12.java
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        System.out.println("Introduza 10 números diferentes:");

        while (contador < 10) {
            System.out.print("Valor " + (contador + 1) + ": ");
            int numeroDigitado = scanner.nextInt();
            boolean repetido = false;

            // Verifica se o número já existe nos valores lidos até ao momento
            for (int i = 0; i < contador; i++) {
                if (vetor[i] == numeroDigitado) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Esse número já foi introduzido. Por favor, digite outro número.");
            } else {
                vetor[contador] = numeroDigitado;
                contador++;
            }
        }

        System.out.println("\nVetor final preenchido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}