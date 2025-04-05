// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.
public class VariaveisExercicio1 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============== Exercício 1 Operações Aritméticas Básicas ============== */

        /* ============================ DECLARACAO ============================ */

        int num1 = 10; // Primeiro número inteiro
        int num2 = 15; // Segundo número inteiro
        int soma; // Soma dos dois números
        int subtracao; // Subtração dos dois números
        int multiplicacao; // Multiplicação dos dois números
        double divisao; // Divisão dos dois números

        /* ============================ OPERACOES ============================ */

        soma = num1 + num2; // Soma dos dois números inteiros
        subtracao = num2 - num1; // Subtração dos dois números inteiros
        multiplicacao = num1 * num2; // Multiplicação dos dois números inteiros

        /* ============================ SAÍDA NO CONSOLE ============================ */

        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
        System.out.println("A subtração de " + num2 + " menos " + num1 + " é: " + subtracao);
        System.out.println("A multiplicação de " + num1 + " e " + num2 + " é: " + multiplicacao);

        if (num2 == 0) { // Verifica se o divisor é zero
            System.out.println("Erro: Divisão por zero!"); // Exibe mensagem de erro
        } else {
            divisao = (double) num1 / num2; // Realiza a divisão
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);
        }
    }
}