package orientacaoObjetos.enums;


public class EstadosMain {

    public static void main(String[] args) {


        EstadosBrasileiros ceara = EstadosBrasileiros.CEARA;
        var es = ceara.estado;
        var sg = ceara.sigla;
        System.out.println(es + " " + sg);



        for (EstadosBrasileiros est : EstadosBrasileiros.values()){
            var estado = est.estado;
            var sigla = est.sigla;

            System.out.println(estado + " " + sigla);

        }
    }
}
