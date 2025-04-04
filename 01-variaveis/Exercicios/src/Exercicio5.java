//Classe principal do programa,sempre deve ter o mesmo nome do arquivo.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ======== Exercício 5: Cálculo de Área e Perímetro de um Retângulo ======== */

        /*
         * Exercício 5: Cálculo de Área e Perímetro de um Retângulo
         ** 
         * Descrição:**
         * Crie um programa que:
         * 
         * - Declare duas variáveis do tipo `double` para armazenar a largura e a altura
         * de um retângulo.
         * - Calcule e exiba a área e o perímetro do retângulo.
         ** 
         * Dicas:**
         * 
         * - A **área** de um retângulo é calculada como: largura × altura.
         * - O **perímetro** é calculado como: 2 × (largura + altura).
         * - Organize o código com seções como **DECLARANDO**, **CALCULANDO** e **SAÍDA
         * NO CONSOLE**.
         * - Teste o programa com diferentes valores de largura e altura.
         */

        /* ============================ DECLARACAO ============================ */

        double alturaRetangulo = 0; // Variável para armazenar o altura do retangulo.
        double larguraRetangulo = 0; // Variável para armazenar a largura do retangulo.
        double areaRetangulo = 0; // Variável para armazenar a área do retangulo.
        double perimetroRetangulo = 0; // Variável para armazenar o perímetro do retangulo.
        DecimalFormat df = new DecimalFormat("#.00"); // Formato para exibir duas casas decimais.

        /* ========================= ENTRADA DE DADOS ========================= */

        // Cria um objeto Scanner para ler a entrada do usuário.
        Scanner input = new Scanner(System.in);

        // Solicita e lê a largura do retangulo (aceitando valores decimais)
        System.out.print("\nDigite a largura do retangulo: ");
        larguraRetangulo = input.nextDouble();

        // Solicita e lê a altura do Retangulo (aceitando valores decimais)
        System.out.print("\nDigite a altura do retangulo: ");
        alturaRetangulo = input.nextDouble();

        // Verifica se a largura e altura são válidas (maiores que zero)
        if (larguraRetangulo <= 0 || alturaRetangulo <= 0) {
            System.out.println("\nErro: A largura e altura devem ser maiores que zero.\n");
        } else {

            /* ============================ OPERACOES ============================ */

            // Calculo de área do retangulo.
            areaRetangulo = (alturaRetangulo * larguraRetangulo);

            // Calculo do perímetro do retangulo.
            perimetroRetangulo = 2 * (larguraRetangulo + alturaRetangulo);

            /* ========================= SAIDA DE DADOS ========================= */

            // Exibe a mensagem da área do retangulo.
            // df.format para formatar o número com duas casas decimais.
            System.out.println("\nA área do retângulo é: " + df.format(areaRetangulo));

            // Exibe a mensagem do perimetro do retangulo.
            // df.format para formatar o número com duas casas decimais.
            System.out.println("\nO perímetro do retângulo é: " + df.format(perimetroRetangulo) + "\n");

            // Fecha o Scanner para liberar recursos
            input.close();

        }

    }
}