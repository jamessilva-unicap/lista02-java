// q5.java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];

        for(int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos com conteúdo ímpar:");
        for(int i = 0; i < 20; i++) {
            if(vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Elementos nas posições pares (índices 0, 2, 4...):");
        // Incrementa o índice de 2 em 2 para apanhar apenas as posições pares
        for(int i = 0; i < 20; i += 2) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }
}