// Classe principal do programa.
public class StringsEx {

    // Método principal do Java, ponto de entrada da aplicação.
    public static void main(String[] args) {

        /* ============================ BASIC STRING ============================ */

        // Exemplo de manipulação de Strings
        String primeiroNome = "Mateus";
        String sobrenome = "Silva";
        String nomeCompleto = primeiroNome + " " + sobrenome;

        // Exibindo informações
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Número de caracteres: " + nomeCompleto.length());

        // Convertendo para maiúsculas
        String maiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome em maiúsculas: " + maiusculo);

        // Substituindo texto
        String nomeEditado = nomeCompleto.replace("Mateus", "João");
        System.out.println("Nome editado: " + nomeEditado);
    }
}