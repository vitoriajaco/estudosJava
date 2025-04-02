package exercicios;

public class Pessoa {

    String nome = "Ameinda";
    int idade = 16;

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this; // Retorna o próprio objeto
    }


    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        String s = pessoa.setNome("Adamastor Pitaco").toString();
        System.out.println(s);

        System.out.println(pessoa.setNome("Craudio").toString());
    }

    
}
