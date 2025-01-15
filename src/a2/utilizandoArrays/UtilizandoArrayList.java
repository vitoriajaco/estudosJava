package a2.utilizandoArrays;

import java.util.ArrayList;
import java.util.List;

public class UtilizandoArrayList {

    public static void main(String[] args) {

    //Adicionando itens a uma lista

        List linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Cobol");
        linguagens.add("C#");
        linguagens.add("Python");
        linguagens.add(2, "Node.js"); //Modo de substituir ou acrescentar um item a lista numa posicao especifica

        System.out.println("A lista de linguagens " + linguagens);
        System.out.println("A lista de linguagens está vazia? " + linguagens.isEmpty());
        System.out.println("O tamanho da lista é de: " + linguagens.size());
        System.out.println("O elemento Java está na posição: " + linguagens.indexOf("Java"));
        System.out.println("O elemento na posição dois é " + linguagens.get(2));

        //Acessando cada item da lista por for
        for (Object linguagem : linguagens){
            System.out.println(linguagem);
        }

        //Operando if e else com condicoes da lista
        if (linguagens.contains("Java")){
            System.out.println("Você é capaz de aprender");

        } else {
            System.out.println("Ficou dificil");

        }

        if (linguagens.isEmpty()){
            System.out.println("Você é capaz de aprender");

        } else  {
            System.out.println("Ficou dificil");

        }

    }
}