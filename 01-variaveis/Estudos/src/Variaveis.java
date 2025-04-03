// Classe principal do programa, sempre deve ter o mesmo nome do arquivo.
public class Variaveis {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============================ DECLARANDO ============================ */

        int idade = 25; // Representa números inteiros, como idades, quantidades, etc.

        double altura = 1.75; // Usada para números decimais.

        char inicialNome = 'M'; // Armazena um único caractere, como iniciais.

        boolean gostaDeJava = true; // Indica verdadeiro (true) ou falso (false).

        String mensagem = "Olá, Mateus! Bem-vindo ao estudo de variáveis."; // Armazena texto.

        /* ============================ SAIDA NO CONSOLE ============================ */

        System.out.println("Idade: " + idade); // Exibe a idade armazenada.

        System.out.println("Altura: " + altura + " metros"); // Exibe a altura armazenada.

        System.out.println("Inicial do nome: " + inicialNome); // Exibe a inicial do nome.

        System.out.println("Gosta de Java? " + gostaDeJava); // Indica se o usuário gosta de Java.

        System.out.println(mensagem); // Exibe a mensagem de boas-vindas armazenada.
    }
}
