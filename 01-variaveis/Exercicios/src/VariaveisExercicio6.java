import java.util.Scanner;
import java.text.DecimalFormat;

public class VariaveisExercicio6 {
    public static void main(String[] args) {

        /* ============================ DECLARACAO ============================ */

        double conversaoTemp = 0; // Resultado da conversão.
        char tempEscolha; // Variável para armazenar a escolha.
        DecimalFormat df = new DecimalFormat("#.00"); // Formato para exibir duas casas decimais.

        /* ========================= ENTRADA DE DADOS ========================= */

        Scanner input = new Scanner(System.in);

        // Solicita e lê a escolha do usuário
        System.out.print("\nDigite 'G' para graus Celsius ou 'F' para Fahrenheit: ");
        tempEscolha = input.next().charAt(0);

        // Converte a entrada para maiúscula para aceitar tanto 'g' quanto 'G'
        tempEscolha = Character.toUpperCase(tempEscolha);

        /* ========================= CONDICIONAIS ========================= */

        /* =================== Se for 'G' =================== */
        if (tempEscolha == 'G') {

            double celsiusTemp = 0; // Variável para armazenar a temperatura em graus Celsius.

            // Solicita e valida a temperatura em graus Celsius com um loop de repetição.
            while (true) {
                System.out.print("\nDigite a temperatura em graus Celsius: ");
                if (input.hasNextDouble()) {
                    celsiusTemp = input.nextDouble();
                    break; // Sai do loop se a entrada for válida
                } else {
                    System.out.println("\nErro: Por favor, digite um número válido.");
                    input.next(); // Limpa a entrada inválida
                }
            }

            // Converte Celsius para Fahrenheit
            conversaoTemp = (celsiusTemp * 9 / 5 + 32);

            // Exibe a temperatura em Fahrenheit
            System.out.println("\nA temperatura em Fahrenheit é: " + df.format(conversaoTemp) + " °F\n");

            /* =================== Se for 'F' =================== */
        } else if (tempEscolha == 'F') {

            double fahrenheitTemp = 0; // Variável para armazenar a temperatura em Fahrenheit.

            // Solicita e valida a temperatura em Fahrenheit com um loop de repetição.
            while (true) {
                System.out.print("\nDigite a temperatura em Fahrenheit: ");
                if (input.hasNextDouble()) {
                    fahrenheitTemp = input.nextDouble();
                    break; // Sai do loop se a entrada for válida
                } else {
                    System.out.println("\nErro: Por favor, digite um número válido.");
                    input.next(); // Limpa a entrada inválida
                }
            }

            // Converte Fahrenheit para Celsius
            conversaoTemp = (fahrenheitTemp - 32) * 5 / 9;

            // Exibe a temperatura em Celsius
            System.out.println("\nA temperatura em Celsius é: " + df.format(conversaoTemp) + " °C\n");

            /* =================== Se for diferente de 'G' ou 'F' =================== */
        } else {
            // Exibe mensagem de erro para entrada inválida
            System.out.print("\nErro: Você deve digitar 'G' para Celsius ou 'F' para Fahrenheit.\n");
        }

        input.close(); // Fecha o Scanner
    }
}