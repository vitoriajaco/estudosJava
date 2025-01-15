package a7.orientacaoObjetos.InstanciandoMelhor;

public class Transacao {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gertrudes da Silva", 56.00);

        var result = cliente.sacar(6.0);

        System.out.println("O valor da conta é: R$" + result);

        Cliente client = new Cliente("Odilon Junior", 32.0);

        var sacarConta = cliente.sacar(17.5);

        System.out.println("O valor da conta é: R$" + sacarConta);

    }
}
