package utilizandoArrays;

public class UtilizandoArray {
    public static void main(String[] args) {

        Integer[] array = new Integer[4];
        array[0] = 2;
        array[1] = 5;
        array[2] = 6;
        array[3] = 8;

        for (int i = 0; i< array.length; i++){
            Integer valor = array[i];
            System.out.println("O valor no index " + i +" é = " + valor);
        }




    }
}