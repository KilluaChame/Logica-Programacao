import java.util.Scanner;

// Classe principal do programa
public class Tipo_Dado_Exercicio5 {

    public static void main(String[] args) {

        /* ========== Exercício 5: Conversão de Tipos ========== */

        int newInt = 0; // Variável para armazenar o número inteiro
        int numeroInteiro = 0; // Número inteiro
        double numeroDecimal = 0.0; // Número decimal
        String texto = ""; // Texto

        /* =============== ENTRADA DE DADOS =============== */
        Scanner input = new Scanner(System.in); // Scanner para entrada de dados

        System.out.println("\n==================== INICIO DO PROGRAMA ====================\n"); // Output de início

        System.out.println("Digite um número decimal: ");// Solicita um número decimal ao usuário
        numeroDecimal = input.nextDouble(); // Lê um número decimal

        System.out.println("\nDigite um número inteiro: ");// Solicita um número inteiro ao usuário
        newInt = input.nextInt(); // Lê um número decimal

        /* =============== CONVERÇÕES =============== */

        // Converte o número decimal para inteiro
        numeroInteiro = (int) numeroDecimal; // Conversão explícita de double para int

        // Converte o número inteiro para texto.
        texto = String.valueOf(newInt); // Conversão de int para String

        /* =============== SAIDA DE DADOS =============== */

        // Exibe o número Decimal convertido para inteiro
        System.out.println("\nNúmero decimal convertido para inteiro: " + numeroInteiro);

        // Exibe o número inteiro convertido para texto
        System.out.println("\nNúmero inteiro convertido para texto: " + texto);

        System.out.println("\n==================== FIM DO PROGRAMA ====================\n"); // Output de fim

        input.close(); // Fecha o Scanner

    }
}