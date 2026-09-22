// q8.java
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[20];

        System.out.println("--- 1º Vetor (10 posições) ---");
        for(int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("--- 2º Vetor (10 posições) ---");
        for(int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            resultado[i * 2] = vetor1[i];
            resultado[i * 2 + 1] = vetor2[i];
        }

        System.out.println("\nVetor Resultante:");
        for(int i = 0; i < 20; i++) {
            System.out.print(resultado[i] + " ");
        }
        
        scanner.close();
    }
}