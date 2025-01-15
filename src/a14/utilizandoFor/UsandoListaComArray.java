package a14.utilizandoFor;

import java.util.Arrays;

public class UsandoListaComArray {
    public static void main(String[] args) {
        String[] alunos = {"Maria", "Jonas", "Leticia", "Gabriel"};
        String[] primeirosAlunos = Arrays.copyOfRange(alunos, 0, 2); // Usando copyofrange utiliza-se tres parametros
        // o primeiro de onde vem, o segundo from de onde começa (inclusivo), e o ultimo "to" onde termina (exclusivo)

        for (String aluno : primeirosAlunos) {
            System.out.println("Os dois primeiros alunos são: " + aluno);
        }

        String primeiroAluno = alunos[0];
        String ultimoAluno = alunos[alunos.length - 1];

        System.out.println("O primeiro aluno é: " + primeiroAluno);
        System.out.println("O ultimo aluno é: "+ ultimoAluno);

    }
}
