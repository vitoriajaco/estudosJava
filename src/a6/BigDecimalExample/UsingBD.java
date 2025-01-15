package a6.BigDecimalExample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsingBD {
    public static void main(String[] args) {
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado = BigDecimal.TEN.divide(divisor,2, RoundingMode.HALF_EVEN);
        System.out.println(resultado);
    }
}


