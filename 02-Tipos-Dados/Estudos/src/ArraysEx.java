// Classe principal do programa.
public class ArraysEx {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============================ BASIC ARRAY ============================ */

        // Array de números inteiros
        int[] numeros = { 10, 20, 30, 40, 50 };

        // Loop para exibir os elementos do array
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        // Modificando o array
        numeros[0] = 100;
        System.out.println("Novo valor na posição 0: " + numeros[0]);
    }
}