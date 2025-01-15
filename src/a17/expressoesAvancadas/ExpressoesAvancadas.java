package a17.expressoesAvancadas;

import java.time.LocalDate;

public class ExpressoesAvancadas {
    public static void main(String[] args) {
        String nome = "Maria Tereza";
        Integer matricula = 3100;
        Double salario = 1800.80;
        LocalDate demissao = LocalDate.now();


        String textoComMatriculaCincoDigitos = String.format("Funcionario(a): %s, Matricula: %05d - Salário: %.2f ", nome, matricula, salario);

        System.out.println(textoComMatriculaCincoDigitos);

        String textoComNomeAlinhadoAEsquerda = String.format("Funcionario(a): %-30s, Matricula: %05d - Salário: %.2f ", nome, matricula, salario);

        System.out.println(textoComNomeAlinhadoAEsquerda);

        String imprimindoData = String.format("A data de demissao foi: %td/%<tm/%<ty", demissao); //expressao %t pegara a data atual O especificador %< indica que o mesmo argumento usado anteriormente deve ser reutilizado. Neste caso, ele reutiliza o argumento demissao. O tm representa o mês como um número decimal
        System.out.println(imprimindoData);

    }
}
