// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.

import java.util.Scanner;

public class Exercicio3 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /*
         * ============== Exercício 3: Calculadora de Reajuste Salarial ==============
         * Desenvolva um programa que:
         * 
         * - Armazene um valor de salário em uma variável.
         * - Utilize uma estrutura condicional para aplicar um reajuste:
         * - Se o salário for menor que um certo valor (por exemplo, 2000), aplique um
         * aumento de 20%.
         * 
         * - Caso contrário, aplique um aumento de 10%.
         * - Exiba o novo salário calculado no console.
         *
         * Dicas:
         * 
         * - Divida o código em seções comentadas (por exemplo, **DECLARANDO**,
         * CALCULANDO** e **SAÍDA NO CONSOLE**).
         * 
         * - Use operações aritméticas para calcular o aumento percentual.
         * - Teste diferentes valores de salário para validar a lógica condicional.
         */

        /* ============================ DECLARACAO ============================ */

        double Salario = 0; // Variável para armazenar o salário
        double NovoSalario = 0; // Variável para armazenar o novo salário após o reajuste
        int Reajuste = 0; // Variável para armazenar o percentual de reajuste

        /* ========================= ENTRADA DE DADOS ========================= */

        // Cria um objeto Scanner para ler a entrada do usuário pelo terminal.
        Scanner input = new Scanner(System.in);

        // Solicita e lê o salário
        System.out.println("Digite o Salário:");
        Salario = input.nextInt();

        // Solicita e lê o percentual de reajuste
        System.out.println("Digite o valor do sálario máximo para os 20% de aumento:");
        Reajuste = input.nextInt();

        /* ========================= SAIDA DE DADOS ========================= */

        // Verifica se o salário é menor que: Reajuste
        if (Salario < Reajuste) {
            // Aplica um aumento de 20%
            NovoSalario = Salario + (Salario * 0.20);
            System.out.println("O novo salário é: " + NovoSalario);
        } // Exibe o novo salário
        else {
            // Aplica um aumento de 10%
            NovoSalario = Salario + (Salario * 0.10);
            System.out.println("O novo salário é: " + NovoSalario); // Exibe o novo salário
        }

        // Fecha o Scanner para liberar recursos
        input.close();
    }

}
