package a8.controleDeFluxoSimples.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        Double quadradoDeAltura = altura * altura;

        var imc = peso/quadradoDeAltura;
        System.out.println(imc);

        if (imc >= 40){
            System.out.println("Obesidade morbida");
            
        } else if (imc < 40 && imc >= 35) {
            System.out.println("Obesidade");            
        } else if (imc < 35 && imc >= 30) {
            System.out.println("Obesidade leve");            
        } else if (imc < 30 && imc >= 25) {
            System.out.println("Sobrepeso");
        } else if (imc < 25 && imc >= 20) {
            System.out.println("Normal");
        }else {
            System.out.println("Abaixo do normal");
        }
    }
}
