import java.util.Scanner;

// Classe principal do programa
public class Tipo_Dado_Exercicio6 {

    public static void main(String[] args) {

        /* =============== Exercício 6: Validação de Tipos =============== */

        /*
         * Crie um programa que:
         * 
         * 1. Solicite ao usuário que insira um número.
         * 
         * 2. Verifique se é um número inteiro ou decimal.
         * 
         * 3. Exiba mensagens apropriadas dependendo do tipo do número.
         */

        /* ============================ DECLARACAO ============================ */

        // Variável para armazenar o número como String
        String numeroStr = "";

        /* ============================ ENTRADA DE DADOS ============================ */

        Scanner input = new Scanner(System.in); // Scanner para entrada de dados

        // Output de início
        System.out.println("\n==================== INICIO DO PROGRAMA ====================\n");

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");

        // Lê o número como String
        numeroStr = input.nextLine();

        /* ============================ SAIDA DE DADOS ============================ */

        // Verifica se o número é um inteiro ou decimal
        if (numeroStr.matches("-?\\d+")) { // Verifica se é um número inteiro
            System.out.println("\nO número " + numeroStr + " é um número inteiro.");
        } else if (numeroStr.matches("-?\\d+\\.\\d+")) { // Verifica se é um número decimal
            System.out.println("\nO número " + numeroStr + " é um número decimal.");
        } else {
            System.out.println("\nErro: O valor inserido não é um número válido.");
        }

        // Output de fim
        System.out.println("\n==================== FIM DO PROGRAMA ====================\n");

        input.close(); // Fecha o Scanner

    }
}