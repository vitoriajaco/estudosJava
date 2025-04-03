package a7.orientacaoObjetos.herancaEPolimorfismo;

public class Sistema {
    public static void main(String[] args) {

        Paciente  paciente = new Paciente("Maria", 32,1234,"Cassi", "Ressaca");
        System.out.println(paciente);

        Medico medico = new Medico("Felipe", 89, 67, "7832",  "Obstetricia");
        System.out.println(medico);

        Medico me = new Medico("Ju", 23,234,"1234", "Geriatra");
        System.out.println(me);

    }
}
