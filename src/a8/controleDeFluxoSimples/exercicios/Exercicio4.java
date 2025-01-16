package a8.controleDeFluxoSimples.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        if(idade >= 16 && idade < 18){
            System.out.println("Pode votar, mas nao pode dirigir");
        } else if (idade >= 18) {
            System.out.println("Pode votar e pode dirigir");

        } else
            System.out.println("Nao pode votar, nem dirigir");
    }
}
