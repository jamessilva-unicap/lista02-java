// q1.java
public class Q1 {
    public static void main(String[] args) {
        // a. Atribuir os valores indicados
        int[] A = {1, 0, 5, -2, -5, 7};

        // b. Armazenar e mostrar a soma de A[0], A[1] e A[5]
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma das posições 0, 1 e 5: " + soma);

        // c. Atribuir o valor 100 à posição 4
        A[4] = 100;

        // d. Mostrar cada valor do vetor A num nova linha
        System.out.println("Valores finais do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}