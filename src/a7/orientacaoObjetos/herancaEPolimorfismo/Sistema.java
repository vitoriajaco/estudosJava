package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Sistema {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juvena");
        pessoa.setIdade(32);
        pessoa.setDocumento(12345);
        System.out.println(pessoa);

        Paciente  paciente = new Paciente("Cassi", "Ressaca");
        paciente.setNome("Maria");
        paciente.setDocumento(321);
        paciente.setIdade(56);
        System.out.println(paciente);
        System.out.println(pessoa);
        System.out.println(paciente);

        Medico medico = new Medico("1234", "Obstetricia");
        medico.setNome("Christian Grey");
        medico.setIdade(45);
        medico.setDocumento(7889);
        System.out.println("Médico " + medico);
    }
}
