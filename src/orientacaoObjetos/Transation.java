package orientacaoObjetos;

public class Transation {

    public static void main(String[] args) {
        Client client = new Client();
        client.nome = "Fabiana";
        client.saldoEmConta = 20.0;

        Double valorSacado = 3.5;


        var result =  client.saldoEmConta - valorSacado;


        System.out.println("A/O " + client.nome + " possuia " + client.saldoEmConta + " e após o saque possui " + result);


        Client client2 = new Client();
        client2.nome = "Tony Ramos";
        client2.saldoEmConta = 900.0;

        var result2 =  client2.saldoEmConta - valorSacado;

        System.out.println("A/O " + client2.nome + " possuia " + client2.saldoEmConta + " e após o saque possui " + result2);

    }
}