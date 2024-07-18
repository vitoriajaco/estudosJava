package utilizandoFor;

public class ContarCarneirinho {
    public static void main(String[] args) {

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Carneirinho " + carneirinhos + "..");
        }
        System.out.println("*** E dormiu...***");

        int carneirinho = 0;
        for ( ;carneirinho<=20; ) {
            System.out.println("Contando " + carneirinho + " carneirinhos ....");
            carneirinho++;
        }
    }
}
