package expressoesBasicas;

public class ExpressoesBasicasOutrosFormatos {
    public static void main(String[] args) {
        String nome = "Maria";
        Integer idade = 31;
        Double peso = 55.8;
        Double salario = 1800.80;
        // %s para sting, %d para integer, %f para double caso queira apontar que sera decimal e usar dois pontos pos virgula usar %.2f
        String texto = String.format("Você é %s, possui %d anos e pesa %.2f quilos", nome, idade, peso);

        System.out.println(texto);

        //Acrescentando o , o ponto é substituido
        String dados = String.format("Você é %s, possui %d anos e seu salario é de R$ %,.2f reais", nome, idade, salario);
        System.out.println(dados);
    }
}
