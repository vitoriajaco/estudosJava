package expressoesBasicas;

public class ExpressoesBasicasOutrosFormatos {
    public static void main(String[] args) {
        String nome = "Maria";
        Integer idade = 31;
        Double peso = 55.8;
        // %s para sting, %d para integer, %f para double caso queira apontar que sera decimal e usar dois pontos pos virgula usar %.2f
        String texto = String.format("Você é %s, possui %d anos e pesa %.2f quilos", nome, idade, peso);
        System.out.println(texto);
    }
}
