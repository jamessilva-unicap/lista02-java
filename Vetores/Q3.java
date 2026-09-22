// q3.java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos com conteúdo par:");
        for(int i = 0; i < 10; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        
        scanner.close();
    }
}