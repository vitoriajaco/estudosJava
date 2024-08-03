package BigDecimalExample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsingBD {
    public static void main(String[] args) {
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado = BigDecimal.TEN.divide(divisor,2, RoundingMode.HALF_EVEN);
        System.out.println(resultado);
    }
}

/*
BigDecimal.TEN é uma constante que representa o valor 10.
O método divide é usado para dividir 10 pelo divisor (3).
O segundo argumento (2) especifica que o resultado deve ter 2 casas decimais.
O terceiro argumento (RoundingMode.HALF_EVEN) especifica o modo de arredondamento.
HALF_EVEN é um modo de arredondamento
que arredonda para o número par mais próximo quando o valor está exatamente no meio.

*/
