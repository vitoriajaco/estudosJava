package exercicios;

import java.util.Scanner;

public class Exercicio015 {

   /* Faça um programa que leia dois números e efetua a adição. Se o valor somado for
    maior que 20, este deverá ser apresentado somando-se a ele 8; se o valor somado for
    menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double num = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double num2 = sc.nextDouble();

        Double soma = num + num2;

        if (soma <= 20){
            Double valor2 = soma - 5;
            System.out.println(valor2);
        }else  {
            Double valor = soma + 8;
            System.out.println(valor);
        }

    }

}
