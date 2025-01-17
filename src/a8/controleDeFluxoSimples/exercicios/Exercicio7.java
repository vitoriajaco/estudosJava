package a8.controleDeFluxoSimples.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    //Se os segmentos do exercício 6 forem tais que a=b=c, o triângulo formado com estes segmentos é
   // chamado de eqüilátero. Se a=bc ou ab=c ou ba=c, o triângulo é chamado isósceles e se abc o
    //triângulo é chamado escaleno. Altere o programa do exercício 6 para, além de verificar se os segmentos
   // podem formar um triângulo, classifique o triângulo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor de a?");
        int a = scanner.nextInt();
        System.out.println("Qual o valor de b?");
        int b = scanner.nextInt();
        System.out.println("Qual o valor de c?");
        int c = scanner.nextInt();


        if ((a+b>c && a+c>b && b+c>a) && (a==b && b==c )) {
            System.out.println("é um triangulo equilátero!");
        } else if ((a+b>c && a+c>b && b+c>a) && ((a==b && b!=c) || (a!=b && b==c) || (b!=a && a==c))) {
            System.out.println("é um triangulo isósceles");

        }else if ((a+b>c && a+c>b && b+c>a) && (a!=b && b!=c)) {
            System.out.println("é um triangulo escaleno!");

        }else {
            System.out.println("não é triangulo");
        }

    }
}


