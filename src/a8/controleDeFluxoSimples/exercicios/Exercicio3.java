package a8.controleDeFluxoSimples.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        if(idade >= 16){
            System.out.println("Pode votar");
        }
    else
        System.out.println("Nao pode votar");
    }
}