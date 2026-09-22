// q7.java
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] vetorIntercalado = new int[40];

        System.out.println("--- Preenchimento do 1º Vetor ---");
        for(int i = 0; i < 20; i++) {
            System.out.print("Vetor 1 - Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("--- Preenchimento do 2º Vetor ---");
        for(int i = 0; i < 20; i++) {
            System.out.print("Vetor 2 - Posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Intercalação
        for(int i = 0; i < 20; i++) {
            vetorIntercalado[i * 2] = vetor1[i];       // Posições pares (0, 2, 4...)
            vetorIntercalado[i * 2 + 1] = vetor2[i];   // Posições ímpares (1, 3, 5...)
        }

        System.out.println("\nVetor Intercalado:");
        for(int i = 0; i < 40; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
        
        scanner.close();
    }
}