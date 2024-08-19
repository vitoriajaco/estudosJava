package expressoesBasicas;

public class ExpressaoBasica {
    public static void main(String[] args) {
        String nome = "Vitoria";
        String sobrenome = "Lima";
        String concatenando = String.format(" Olá %s %s", nome, sobrenome);

        System.out.println(concatenando);



    }
}
