package a7.orientacaoObjetos.Istanciacao2;

public class Clientee {

    String nome;
    Double limiteCredito = 100.0;

    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado + limiteCredito;
    }

    public void comprar (Double valor){
        limiteCredito = limiteCredito - valor;
    }
}
