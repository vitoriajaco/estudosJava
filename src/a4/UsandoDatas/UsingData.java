package a4.UsandoDatas;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsingData {
    public static void main(String[] args) {
        //Local date now
        LocalDate dataatual = LocalDate.now();
        System.out.println(dataatual);

        //Data posterior a partir da data de hoje
        LocalDate amanha = dataatual.plusDays(1);
        System.out.println(amanha);

        String dataBrFormatter = "03/08/2024";

        //Formatando data a um padrao pre estabelecido
        DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConcreta = LocalDate.parse(dataBrFormatter, dataTimeFormatter);


        System.out.println(dataConcreta);


        //Formatando um outro tipo de data
        DateTimeFormatter dataTime = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dataTime.format(amanha));


    }

}
