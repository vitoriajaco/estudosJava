package diferenciandoVariaveis;

public class UtilizandoVariaveis {

    // Variável de instância final
    final int num = 3;

    public UtilizandoVariaveis() {
        // Construtor vazio
    }

    // Método principal
    public static void main(String[] args) {
        UtilizandoVariaveis util = new UtilizandoVariaveis();

        // Chamando o método somar
        int resultado = util.somar(5); // Passando 5 como argumento
        System.out.println("Resultado da soma: " + resultado);
    }

    // Método para somar
    public int somar(int number) {
        final int a = 1; // Variável local final
        return a + number; // Soma a variável final com o argumento
    }
}

//Por que usar final?
//Imutabilidade: Garante que o valor de uma variável não será alterado acidentalmente.
//Segurança: Ajuda a evitar bugs, especialmente em cenários onde o valor de uma variável não deve mudar.
//Boas práticas: Usar final em variáveis que não precisam ser alteradas torna o código mais legível e fácil de entender.