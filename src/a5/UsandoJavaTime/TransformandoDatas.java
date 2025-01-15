package a5.UsandoJavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TransformandoDatas {
    public static void main(String[] args) {
        LocalDate dataAgora = LocalDate.now();
        LocalTime horaManipulada = LocalTime.of(04,20);

        var concatenandoHoras = dataAgora.atTime(horaManipulada);

        esperaDataHora(concatenandoHoras);

        System.out.println(concatenandoHoras);

    }

    static void esperaDataHora(LocalDateTime data){

    }
}
