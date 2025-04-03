// Classe principal do programa.
public class VariaveisOperacoesApp {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============================ DECLARANDO ============================ */

        int num1 = 10; // Primeiro número para a operação.
        int num2 = 20; // Segundo número para a operação.

        double precoProduto1 = 15.50; // Preço do primeiro produto.
        double precoProduto2 = 25.75; // Preço do segundo produto.

        /* ============================ CALCULANDO ============================ */

        int soma = num1 + num2; // Soma dos dois números inteiros.
        int subtracao = num2 - num1; // Subtração dos dois números inteiros.
        int multiplicacao = num1 * num2; // Multiplicação dos dois números inteiros.

        double totalCompra = precoProduto1 + precoProduto2; // Soma dos preços dos produtos.

        /* ============================ SAÍDA NO CONSOLE ============================ */

        System.out.println("Resultado da soma: " + soma); // Exibe o resultado da soma.
        System.out.println("Resultado da subtração: " + subtracao); // Exibe o resultado da subtração.
        System.out.println("Resultado da multiplicação: " + multiplicacao); // Exibe o resultado da multiplicação.
        System.out.println("Total da compra: R$ " + totalCompra); // Exibe o total da compra.
    }
}
