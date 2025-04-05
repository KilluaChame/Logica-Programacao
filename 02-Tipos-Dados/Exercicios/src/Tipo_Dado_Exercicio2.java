import java.util.Scanner;

public class Tipo_Dado_Exercicio2 {

    public static void main(String[] args) {

        /* ================ EXERCICIO 2 Manipulando Strings ================ */

        /* ============================ DECLARACAO ============================ */
        String nome1;
        String nome2;
        String nomeCompleto;

        /* ========================= ENTRADA DE DADOS ========================= */
        Scanner input = new Scanner(System.in);
        System.out.println("\n==================== INICIO DO PROGRAMA ====================\n");

        while (true) { // Loop para garantir que o nome contém apenas letras
            System.out.print("Digite o primeiro nome (somente letras): ");
            nome1 = input.nextLine().trim(); // Remove espaços extras
            if (nome1.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("\nErro: O nome deve conter apenas letras. Tente novamente.\n");
            }
        }

        while (true) { // Loop para garantir que o nome contém apenas letras
            System.out.print("\nDigite o segundo nome (somente letras): ");
            nome2 = input.nextLine().trim(); // Remove espaços extras
            if (nome2.matches("[a-zA-Z]+")) {
                break;
            } else { // Se o nome não contém apenas letras, exibe mensagem de erro
                System.out.println("\nErro: O nome deve conter apenas letras. Tente novamente.\n");
            }
        }

        // Ajustando para a primeira letra maiúscula
        nome1 = nome1.substring(0, 1).toUpperCase() + nome1.substring(1).toLowerCase();
        nome2 = nome2.substring(0, 1).toUpperCase() + nome2.substring(1).toLowerCase();
        nomeCompleto = nome1 + " " + nome2;

        /* ======================== SAIDA DE DADOS ======================== */
        System.out.println("\nO nome completo é: " + nomeCompleto);
        System.out.println("Número de caracteres no nome completo: " + nomeCompleto.length());
        System.out.println("\n==================== FIM DO PROGRAMA ====================\n");

        input.close();
    }
}
