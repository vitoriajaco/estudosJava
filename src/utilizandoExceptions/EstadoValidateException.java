package utilizandoExceptions;

public class EstadoValidateException extends RuntimeException{
    public EstadoValidateException(){
        super ("O Estado não foi localizado!");
    }

}