package a15.utilizandoExceptions;

public class UsingException {
    public static void main(String[] args) {
        try{
            // cenário otimista
            Double valor = (double) (100/0);
            System.out.println(valor);

        }
        catch (Exception ex){
            // caso ocorra exceção
            System.out.println("Erro");
            ex.printStackTrace();

        } finally {
            System.out.println("Finally bloco");
        }
    }

    }
