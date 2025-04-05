import java.util.Scanner;

public class Tipo_Dado_Exercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==================== INICIO DO PROGRAMA ====================\n");

        // Solicita ao usuário o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int n = input.nextInt(); // Lê o tamanho do array

        // Declara e inicializa o array com o tamanho especificado
        int[] numeros = new int[n];

        // Preenche o array com valores fornecidos pelo usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": "); // Mostra posição começando em 1
            numeros[i] = input.nextInt();
        }

        // Exibe os valores do array
        System.out.println("\nValores no array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Posição " + (i + 1) + ": " + numeros[i]); // Mostra posição começando em 1
        }

        System.out.println("\n==================== FIM DO PROGRAMA ====================\n");

        input.close(); // Fecha o Scanner
    }
}