package exercicios;

import java.util.Scanner;

public class Exercicio5 {
     //Dados três segmentos de reta a, b e c, se a+b>c e a+c>b e b+c>a, estes podem formar um triângulo.
    // Faça um programa que dados os valores dos segmentos de reta a, b e c, verifica se pode ser
    // construído um triângulo com estes segmentos.

    //Cenários para formar triangulo: (a = 6), (b = 7), (c = 8); a = 5), (b = 5), (c = 8); (a = 5), (b = 5), (c = 5).
    // Cenarios que NAO sao triangulo: a = 10), (b = 4), (c = 5).  (a = 0), (b = 5), (c = 7). (a = -3), (b = -4), (c = -5).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor de a?");
        int a = scanner.nextInt();
        System.out.println("Qual o valor de b?");
        int b = scanner.nextInt();
        System.out.println("Qual o valor de c?");
        int c = scanner.nextInt();


        if (a+b>c && a+c>b && b+c>a ){
            System.out.println("é tringulo!!!");

        }else {
            System.out.println("não é triangulo");
        }

    }
}
