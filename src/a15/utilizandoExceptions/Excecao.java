package a15.utilizandoExceptions;

public class Excecao {
    public static void main(String[] args) {
        checkEstado("PI");
    }

    static void checkEstado(String estado) throws EstadoValidateException{
        if (!estado.equalsIgnoreCase("PE"))
            throw new EstadoValidateException();
        System.out.println("Bem vindo ao estado de " + estado.toUpperCase());
    }
}

//As propostas das excecoes de Runtime é a nao necessidade de que se trate a excecao primeiro