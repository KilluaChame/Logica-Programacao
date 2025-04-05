import java.util.ArrayList;
import java.util.Scanner;

// Classe principal do programa
public class Tipo_Dado_Exercicio4 {

    public static void main(String[] args) {

        /* ========== Exercício 4: Criando e Usando Objetos ========== */

        Scanner input = new Scanner(System.in);
        ArrayList<ClassLivro> livros = new ArrayList<>(); // Lista para armazenar os livros

        /* =============== MENU DO USUÁRIO =============== */
        while (true) {
            // Exibe o menu para o usuário
            System.out.println("\n==================== MENU ====================");
            System.out.println("1. Cadastrar um novo livro");
            System.out.println("2. Exibir os dados de um livro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer

            /* =============== OPCAO 1 =============== */
            if (opcao == 1) {
                // Cadastrar um novo livro
                ClassLivro novoLivro = new ClassLivro();

                System.out.print("Digite o título do livro: ");
                novoLivro.titulo = input.nextLine();

                System.out.print("Digite o autor do livro: ");
                novoLivro.autor = input.nextLine();

                System.out.print("Digite o número de páginas: ");
                novoLivro.paginas = input.nextInt();

                System.out.print("Digite o ID do livro: ");
                novoLivro.id = input.nextInt();
                input.nextLine(); // Limpa o buffer

                // Adiciona o livro à lista
                livros.add(novoLivro);
                System.out.println("Livro cadastrado com sucesso!");

                /* =============== OPCAO 2 =============== */
            } else if (opcao == 2) {
                // Exibir os dados de um livro
                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    System.out.print("Digite o ID do livro que deseja exibir: ");
                    int idBusca = input.nextInt();
                    input.nextLine(); // Limpa o buffer

                    // Busca o livro pelo ID
                    boolean encontrado = false;
                    for (ClassLivro livro : livros) {
                        if (livro.id == idBusca) {
                            System.out.println("\nDados do livro:");
                            livro.exibirDados();
                            encontrado = true;
                            break;
                        }
                    }

                    // Se o livro não for encontrado, exibe uma mensagem
                    if (!encontrado) {
                        System.out.println("Livro com ID " + idBusca + " não encontrado.");
                    }
                }

                /* =============== OPCAO 3 =============== */
            } else if (opcao == 3) {
                // Sair do programa
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close(); // Fecha o Scanner

    }
}

// Definição de uma classe simples chamada ClassLivro
class ClassLivro {
    String titulo;
    String autor;
    int paginas;
    int id;

    // Método para exibir os detalhes do livro
    void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("ID: " + id);
    }
}