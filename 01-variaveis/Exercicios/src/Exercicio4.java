
// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.
import java.util.Scanner;

public class Exercicio4 {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /*
         * =========== Exercício 4: Média de Notas e Situação do Aluno =========== /
         * 
         * /*- Declare três variáveis do tipo `double` para armazenar as notas de um
         * aluno.
         *
         * - Calcule a média das três notas.
         * - Exiba uma mensagem informando se o aluno foi aprovado ou reprovado
         * (por exemplo, aprovado se a média for 7.0 ou superior).
         * 
         * Dicas:
         * - Utilize o mesmo padrão de comentários (seções para DECLARANDO, CALCULANDO e
         * SAÍDA NO CONSOLE).
         * - Implemente uma estrutura condicional para verificar se a média atende ao
         * critério de aprovação.
         * - Teste com diferentes conjuntos de notas para garantir que o programa
         * funciona corretamente em todos os cenários.
         */

        /* ============================ DECLARACAO ============================ */

        double nota1 = 0; // Variável para armazenar a primeira nota
        double nota2 = 0; // Variável para armazenar a segunda nota
        double nota3 = 0; // Variável para armazenar a terceira nota
        double media = 0; // Variável para armazenar a média das notas
        double mediaMinima = 0; // Variável para armazenar a média mínima para aprovação

        /* ========================= ENTRADA DE DADOS ========================= */

        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Solicita e lê a primeira nota (aceitando valores decimais)
        System.out.print("\nDigite a primeira nota: ");
        nota1 = input.nextDouble(); // Lê a primeira nota

        // Solicita e lê a segunda nota (aceitando valores decimais)
        System.out.print("\nDigite a segunda nota: ");
        nota2 = input.nextDouble(); // Lê a segunda nota

        // Solicita e lê a terceira nota (aceitando valores decimais)
        System.out.print("\nDigite a terceira nota: ");
        nota3 = input.nextDouble(); // Lê a terceira nota

        // Solicita e lê a média mínima para aprovação (aceitando valores decimais)
        System.out.print("\nDigite a média mínima para aprovação: ");
        mediaMinima = input.nextDouble(); // Lê a média mínima para aprovação

        /* ============================ OPERACOES ============================ */

        // Verifica se as notas são válidas (maiores ou iguais a zero)
        if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10) {
            System.out.println("\nNota inválida! As notas devem ser maiores ou iguais a zero e menores que dez.");
            return; // Encerra o programa se alguma nota for inválida
        }

        // Calcula a média das três notas
        media = (nota1 + nota2 + nota3) / 3;

        /* ========================= SAIDA DE DADOS ========================= */

        // Verifica se a média é maior ou igual à média mínima
        if (media >= mediaMinima) {
            System.out.printf("\nA média do aluno é: %.1f O aluno foi aprovado.\n", media);
        } else {
            System.out.printf("\nA média do aluno é: %.1f O aluno foi reprovado.\n", media);
        }
    }
}