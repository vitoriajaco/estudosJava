package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Medico extends Pessoa {

    String matricula;

    String especialidade;

    public Medico(String matricula, String especialidade) {
        super();
        this.matricula = matricula;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "matricula='" + matricula + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", documento=" + documento +
                '}';
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
