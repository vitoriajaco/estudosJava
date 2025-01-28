package exercicios;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio011 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Double reajuste = 0.01;
        System.out.println("Qual seu saldo?");
        BigDecimal valorSaldo = scanner.nextBigDecimal();

        BigDecimal saldoReajustado = valorSaldo.multiply(BigDecimal.valueOf(reajuste));
        BigDecimal total = valorSaldo.add(saldoReajustado);

        System.out.println("Seu saldo reajustado é de r$ " + total);

    }
}
