package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    // Faça um programa que leia três notas, calcule e mostre a média aritmética entre elas.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 01: ");
        Double nota = scanner.nextDouble();
        System.out.println("Digite a nota 02: ");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 03: ");
        Double nota3 = scanner.nextDouble();

        Double media = (nota + nota2 + nota3)/3;
        System.out.println("Sua média é " + media);



    }
}