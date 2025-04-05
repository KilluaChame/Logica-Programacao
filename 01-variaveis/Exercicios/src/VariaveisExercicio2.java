// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.

import java.util.Scanner;

public class VariaveisExercicio2 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============== Exercício 2: Comparação de Números ============== */

        // Crie um programa que declare duas variáveis (pode ser `int` ou `double`) e,
        // usando estruturas condicionais (`if-else`), determine e exiba qual número é
        // maior, ou se eles são iguais.

        // Dicas:
        // - Separe a declaração das variáveis da lógica condicional com comentários
        // para facilitar o entendimento.
        // - Exiba mensagens claras para cada caso de comparação (por exemplo, "número 1
        // é maior", "números iguais", "número 2 é maior").

        /* ============================ DECLARACAO ============================ */
        int num1 = 0;
        int num2 = 0;

        /* ========================= ENTRADA DE DADOS ========================= */
        // Cria um objeto Scanner para ler a entrada do usuário pelo terminal.
        Scanner input = new Scanner(System.in);

        // Solicita e lê o primeiro número
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        // Solicita e lê o segundo número
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        /* ========================= SAIDA DE DADOS ========================= */

        if (num1 > num2) {
            System.out.println("O primeiro número é maior."); // Exibe mensagem se o primeiro número for maior
        } else if (num2 > num1) {
            System.out.println("O segundo número é maior."); // Exibe mensagem se o segundo número for maior
        } else {
            System.out.println("Os números são iguais."); // Exibe mensagem se os números forem iguais
        }

        // Fecha o Scanner para liberar recursos
        input.close();

    }

}