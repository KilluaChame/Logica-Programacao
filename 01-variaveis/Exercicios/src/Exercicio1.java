// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.
public class Exercicio1 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============== Exercício 1 Operações Aritméticas Básicas ============== */

        /*
         * Descrição: Crie um programa que declare duas variáveis inteiras,
         * realize as quatro operações matemáticas (soma, subtração, multiplicação e
         * divisão) entre elas e exiba os resultados no console.
         * 
         * Dicas: Use comentários no mesmo formato que adotamos nos exemplos (seções
         * para DECLARANDO, CALCULANDO e SAÍDA NO CONSOLE).
         * Certifique-se de tratar o caso de divisão por zero se decidir usar uma
         * variável que possa ser zero em alguma situação.
         */

        /* ============================ DECLARACAO ============================ */

        int num1 = 10; // Primeiro número inteiro
        int num2 = 15; // Segundo número inteiro
        int soma = 0; // Variável para armazenar a soma
        int subtracao = 0; // Variável para armazenar a subtração
        int multiplicacao = 0; // Variável para armazenar a multiplicação
        double divisao = 0; // Variável para armazenar a divisão
        boolean ErroDiv = false; // Variável para armazenar o erro de divisão por zero

        /* ============================ OPERACOES ============================ */

        soma = num1 + num2; // Soma dos dois números inteiros

        subtracao = num2 - num1; // Subtração dos dois números inteiros

        multiplicacao = num1 * num2; // Multiplicação dos dois números inteiros

        if (num2 != 0) { // Verifica se o divisor não é zero
            divisao = (double) num1 / num2; // Divisão dos dois números inteiros
            ErroDiv = false; // Indica que não houve erro de divisão por zero
        } else {
            ErroDiv = true; // Indica que houve erro de divisão por zero
        }

        /* ============================ SAÍDA NO CONSOLE ============================ */

        System.out.println("Resultado da soma: " + soma); // Exibe o resultado da soma

        System.out.println("Resultado da subtração: " + subtracao); // Exibe o resultado da subtração

        System.out.println("Resultado da multiplicação: " + multiplicacao); // Exibe o resultado da multiplicação

        if (ErroDiv) { // Verifica se houve erro de divisão por zero
            System.out.println("Erro: Divisão por zero!"); // Se tem erro: Exibe mensagem de erro
        } else {
            System.out.println("Resultado da divisão: " + divisao); // Se n tem erro: Exibe o resultado da divisão
        }

    }
}