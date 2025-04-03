package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Paciente extends Pessoa {

    String planoDeSaude;

    String prontuario;

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "planoDeSaude='" + planoDeSaude + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", documento=" + documento +
                '}';
    }

    public Paciente(String nome, int idade, int documento, String planoDeSaude, String prontuario) {
        super(nome, idade, documento);
        this.planoDeSaude = planoDeSaude;
        this.prontuario = prontuario;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
