package utilizandoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilizandoCollections {

    public static void main(String[] args) {

            List<Integer> numeros = Arrays.asList(1, 3, 5, 2, 4);

            // Ordenando a lista em ordem inversa usando o comparador retornado por reverseOrder()
            Collections.sort(numeros, Collections.reverseOrder());

            System.out.println("Lista ordenada em ordem inversa: " + numeros);
        }
}
