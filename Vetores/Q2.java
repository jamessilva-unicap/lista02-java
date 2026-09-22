// q2.java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        for(int i = 0; i < 6; i++) {
            System.out.print("Introduza o " + (i+1) + "º valor inteiro: ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("\nValores lidos:");
        for(int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
        
        scanner.close();
    }
}