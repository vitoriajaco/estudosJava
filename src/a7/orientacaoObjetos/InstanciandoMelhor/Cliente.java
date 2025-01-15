package a7.orientacaoObjetos.InstanciandoMelhor;

public class Cliente {

    public String cliente;
    public double valorContaCorrente;
    public double valorSacado;

    public Cliente(String cliente, double valorContaCorrente) {
        this.cliente = cliente;
        this.valorContaCorrente = valorContaCorrente;
    }

    public double sacar (double valorSacado){
        var result =  valorContaCorrente - valorSacado;
        return result;
    }
}
