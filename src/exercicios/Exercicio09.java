package exercicios;

import java.util.Scanner;

public class Exercicio09 {

    // Faça um programa para converter um certo valor em reais para dólares

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double dolarHoje = 5.90;
        System.out.println("Digite o valor que deseja converter: ");
        Double valorConversao = scanner.nextDouble();
        Double resultado = valorConversao * dolarHoje;
        System.out.println("O valor em dolar é de: " + resultado);
    }
}
