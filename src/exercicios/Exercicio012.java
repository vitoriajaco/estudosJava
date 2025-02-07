package exercicios;

import java.util.Scanner;

public class Exercicio012 {

   /* Escreva um programa que leia dois valores reais.
    Ambos valores deverão ser lidos até que o usuário
    digite um número no intervalo de 1 a 100.
    Apresentar a soma dos dois valores lidos*/

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            Double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            Double numero2 = scanner.nextDouble();

            boolean condicao = numero1 >= 1 && numero1 <= 100 && numero2 >= 1 && numero2 <= 100;

            if (condicao) {
                Double soma = (numero1 + numero2);
                System.out.println(soma);
                break;

            } else {
                System.out.println("O numero que vc digitou esta incorreto");
                condicao = false;
            }


        }
    }
}

