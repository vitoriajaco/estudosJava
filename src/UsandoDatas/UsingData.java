package UsandoDatas;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsingData {
    public static void main(String[] args) {
        LocalDate dataatual = LocalDate.now();
        System.out.println(dataatual);

        LocalDate amanha = dataatual.plusDays(1);
        System.out.println(amanha);

        String dataBrFormatter = "03/08/2024";

        DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConcreta = LocalDate.parse(dataBrFormatter, dataTimeFormatter);

        System.out.println(dataConcreta);

    }

}
