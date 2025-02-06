package a13.utilizandoWhile;

import java.util.Random;

public class UsandoWhile2 {
    public static void main(String[] args) {


        System.out.println("Acordado..");
        boolean dormiu = false;

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Carneirinhos..." + carneirinhos);
            if (dormiu = new Random().nextInt(20) == carneirinhos) {
                System.out.println("Dormiu...");
                break;
            }


        }


    }
}
