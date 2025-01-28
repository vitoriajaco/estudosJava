package exercicios;

import java.util.Scanner;

public class Exercicio02 {

   // Faça um programa que leia dois números e apresente na tela o maior deles. A mensagem deve ser:
     // “Maior número entrado: <número>”, onde em <número> deve aparecer o maior número entrado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero que você quer comparar");
        int numero = scanner.nextInt();

        System.out.println("Digite um OUTRO numero que você quer comparar");
        int segundoNumero = scanner.nextInt();

        if (numero > segundoNumero) {
            System.out.println("O maior numero é: " + numero);
        }

        if (numero < segundoNumero) {
            System.out.println("O maior numero é: " + segundoNumero);
        }
    }
}
