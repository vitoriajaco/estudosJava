package utilizandoFor;

public class ExemploComForIfBreak {
    public static void main(String[] args) {

        for (int numero = 1; numero <=5; numero++ ){
            if (numero == 3) //Caso queira imprimir o 3 a logica precisa ser (numero > 3)
                break;
            System.out.println(numero);
        }
    }
}
