package a13.utilizandoWhile;

import java.util.Random;

public class UsandoWhile2 {
    public static void main(String[] args) {


        System.out.println("Acordado..");
        boolean dormiu = false;
        Random random = new Random();

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Carneirinhos..." + carneirinhos);
            if (dormiu = random.nextInt(20) == carneirinhos) {
                System.out.println("Dormiu...");
                break;
            }
        }

        System.out.println("_________________AGORA É CABRITINHHO");

        int cabritinho = 0;
        boolean asleep = true;
        while (asleep){
            System.out.println("Contando cabritinhos.." + (++cabritinho));
            asleep = !(random.nextInt(5) == cabritinho);
            if (cabritinho==20) {
                cabritinho = 0;


            }

        }
        System.out.println("DORMIU!!");

    }
}
