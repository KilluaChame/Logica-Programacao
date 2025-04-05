// Classe principal do programa.
public class ObjectsEx {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ======================== OBJECTS ======================== */

        // Definição de uma classe simples chamada Pessoa
        class Pessoa {
            int id; // Chave primária
            String nome;
            int idade;

            // Método para exibir os detalhes da pessoa
            void exibirDados() {
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
            }

            // Método para modificar a idade
            void atualizarIdade(int novaIdade) {
                idade = novaIdade;
            }
        }

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Atribuindo valores ao objeto
        pessoa.id = 1; // Atribuindo um identificador único
        pessoa.nome = "Mateus";
        pessoa.idade = 25;

        // Exibindo os dados do objeto
        System.out.println("Dados iniciais:");
        pessoa.exibirDados();

        // Atualizando a idade
        pessoa.atualizarIdade(26);
        System.out.println("\nDados após atualização:");
        pessoa.exibirDados();
    }
}