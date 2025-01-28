package exercicios;

import java.util.Scanner;

public class Exercicio01 {

// Faça um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero que você quer comparar");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O numero inserido é maior que zero");
        } else if (numero < 0) {
            System.out.println("O numero inserido é menor que zero");
        } else
            System.out.println("O numero é igual a zero");
    }
}
