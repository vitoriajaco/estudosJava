package exercicios;

import java.util.Scanner;

public class Exercicio14 {

  /* / Um comerciante comprou um produto e quer vendê-lo com lucro de 45% se o valor da
    compra for menor que 20,00; caso contrário, o lucro será de 30%. Ler o valor do produto e
    imprimir o valor da venda
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");

        double produto = scanner.nextDouble();


        if (produto < 20.0){
            double lucroo = produto * 1.45;
            System.out.println("O preço final é de: " + lucroo);
        }else{
            double lucroo = produto * 1.30;
            System.out.println("O preço final é de: " + lucroo);
        }

        scanner.close();

    }
}
