package a15.utilizandoExceptions;

public class Exception2 {

    public static void main(String[] args) {
       try {
           checkEstadoo("ma");
    } catch (EstadoValidateException e){
           System.out.println(e.getMessage());
           System.out.println("Selecione um estado valido");
    } catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("Selecione um estado valido");
       }


}

     static void checkEstadoo(String estate) throws EstadoValidateException, Exception{
        if (!estate.equalsIgnoreCase("PE"))
            throw new Exception("Esse estado nao existe");
         if (!estate.equalsIgnoreCase("PE"))
             throw new EstadoValidateException();
        System.out.println("Bem vindo ao estado de " + estate.toUpperCase());
    }


}
