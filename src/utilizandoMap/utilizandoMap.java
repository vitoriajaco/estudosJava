package utilizandoMap;

import java.util.*;

public class utilizandoMap {
    public static void main(String[] args) {

        Map<String, String> nomeSobrenome = new HashMap<>();

        nomeSobrenome.put("Maria", "Silva");
        nomeSobrenome.put("João", "Gomes");
        nomeSobrenome.put("Zé", "Vaqueiro");

        System.out.println(nomeSobrenome);

        List<String> atividades = new ArrayList<>();
        atividades.add("Comprar Xampu");
        atividades.add("Comer feijoada");

        Collections.reverse(atividades);
        System.out.println(atividades);


        Map<Integer, List<String>> toDoList = new HashMap<>();
        toDoList.put(1, atividades);

       toDoList.get(1).add("Estudar javinha");
       System.out.println(toDoList);

        List<String> listaDeCompras = Arrays.asList("Tomate", "Limão");
        Map<Integer, List<String>> ordemDeCompras = new HashMap<>();

        ordemDeCompras.put(1, listaDeCompras);
        System.out.println(ordemDeCompras);


    }
}
