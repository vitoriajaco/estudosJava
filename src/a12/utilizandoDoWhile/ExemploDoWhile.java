package a12.utilizandoDoWhile;

import java.util.Random;

public class ExemploDoWhile {

    private static int numeroTentativas = 0;
    public static void main(String[] args) {

        System.out.println("Discando um numero...");
        do {
            System.out.println("Telefone tocando..");
        }while(tocando());

        if (numeroTentativas<=5)
            System.out.println("Alô!!");
            else
            System.out.println("nao Atendeu");
        }



        private static boolean tocando () {
            numeroTentativas++;
            boolean atendeu = new Random().nextInt(5)==1;
            if (numeroTentativas==5)
                return false;
            else
                return !atendeu;
        }
}
