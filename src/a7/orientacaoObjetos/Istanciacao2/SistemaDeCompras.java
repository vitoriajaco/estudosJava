package a7.orientacaoObjetos.Istanciacao2;

public class SistemaDeCompras {
    public static void main(String[] args) {
        Clientee jurema = new Clientee();
        //Chamando valor de limite já determinado
        System.out.println(jurema.limiteCredito);
        //Adicionando crédito a conta
        jurema.solicitarLimiteCredito(50.0);
        System.out.println("Credito aprovado! Seu saldo em banco agora é de R$" + jurema.limiteCredito);
        //Realizando compra e dedução do valor
        jurema.comprar(2.0);
        System.out.println("Valor em conta R$" +jurema.limiteCredito);


    }
}
