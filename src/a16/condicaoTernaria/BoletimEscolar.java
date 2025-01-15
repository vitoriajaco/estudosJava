package a16.condicaoTernaria;

public class BoletimEscolar {

    public static void main (String[] args){

        int media = 7;
        int notaBaixa = 3;
        int notaAlta = 8;

        String resultado = notaBaixa >= media ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultado2 = notaAlta>= media ? "Aprovado" : "Reprovado";
        System.out.println(resultado2);

        String resultado3 = notaBaixa >= media ? "Aprovado" : notaBaixa >=5 && notaBaixa<7 ? "Recuperação" : "Reprovado direto";
        System.out.println(resultado3);



    }

}
