package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Pessoa {

    String nome;
    int idade;

    int documento;

    public Pessoa(String nome, int idade, int documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", documento=" + documento +
                '}';
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
