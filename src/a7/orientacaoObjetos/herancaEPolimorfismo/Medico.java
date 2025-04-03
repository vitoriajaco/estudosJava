package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Medico extends Pessoa {

    String matricula;

    String especialidade;

    public Medico(String nome, int idade, int documento, String matricula, String especialidade) {
        super(nome, idade, documento);
        this.matricula = matricula;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Medico [documento" + this.documento + ", especialidade=" + this.especialidade + "]";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
