
// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.
import java.util.Scanner;

public class Exercicio3 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* =========== Exercício 3: Calculadora de Reajuste Salarial =========== */

        /*
         * Descrição: Desenvolva um programa que:
         * 
         * - Armazene um valor de salário em uma variável.
         * - Utilize uma estrutura condicional para aplicar um reajuste:
         * - Se o salário for menor que um certo valor (por exemplo, 2000), aplique um
         * aumento de 20%.
         * - Caso contrário, aplique um aumento de 10%.
         * - Exiba o novo salário calculado no console.
         * 
         * Dicas:
         * 
         * - Divida o código em seções comentadas (por exemplo, DECLARANDO,
         * CALCULANDO e SAÍDA NO CONSOLE).
         * - Use operações aritméticas para calcular o aumento percentual.
         * - Teste diferentes valores de salário para validar a lógica condicional.
         */

        /* ============================ DECLARACAO ============================ */

        double salario = 0; // Variável para armazenar o salário
        double novoSalario = 0; // Variável para armazenar o novo salário após o reajuste
        double limiteReajuste = 0; // Variável para armazenar o valor que define o limite para aumento de 20%

        /* ========================= ENTRADA DE DADOS ========================= */

        Scanner input = new Scanner(System.in);

        // Solicita e lê o salário (aceitando valores decimais)
        System.out.print("Digite o Salário: ");
        salario = input.nextDouble();

        // Solicita e lê o valor limite para aplicar aumento de 20%
        System.out.print("Digite o valor máximo para ganhar 20% de aumento: ");
        limiteReajuste = input.nextDouble();

        /* ========================= SAIDA DE DADOS ========================= */

        // Verifica se o sa//lário é menor que o limiteReajuste
        if (salario < limiteReajuste) {
            // Aplica um aumento de 20%
            novoSalario = salario + (salario * 0.20);
            System.out.println("O novo salário é: " + novoSalario);
        } else {
            // Aplica um aumento de 10%
            novoSalario = salario + (salario * 0.10);
            System.out.println("O novo salário é: " + novoSalario);
        }

        // Fecha o Scanner para liberar recursos
        input.close();
    }
}
