package a15.utilizandoExceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class UsingParseException {
    public static void main(String[] args) {
       try {
        Number valor = NumberFormat.getCurrencyInstance().parse("a175");
           System.out.println(valor);

    } catch (ParseException e) {
          e.printStackTrace();
           }
    }
}
