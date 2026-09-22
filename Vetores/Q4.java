// q4.java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];

        for(int i = 0; i < 15; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes na sequência contrária:");
        // Começa no último índice (14) e vai até ao primeiro (0)
        for(int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
        scanner.close();
    }
}