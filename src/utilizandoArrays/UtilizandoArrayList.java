package utilizandoArrays;

import java.util.ArrayList;
import java.util.List;

public class UtilizandoArrayList {

    public static void main(String[] args) {

        List linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Cobol");
        linguagens.add("C#");
        linguagens.add("Python");

        System.out.println("A lista de linguagens " + linguagens);
        System.out.println("A lista de linguagens está vazia? " + linguagens.isEmpty());
        System.out.println("O tamanho da lista é de: " + linguagens.size());
        System.out.println("O elemento Java está na posição: " + linguagens.indexOf("Java"));
        System.out.println("O elemento na posição dois é " + linguagens.get(2));


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