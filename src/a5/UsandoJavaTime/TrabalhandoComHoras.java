package a5.UsandoJavaTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TrabalhandoComHoras {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String horaFormatada = agora.format(timeFormatter);
        System.out.println("Agora são: " + horaFormatada);

       String meiaHora = agora.plusMinutes(30).format(timeFormatter);
        System.out.println("Adicionando meia hora " + meiaHora);

        var menosUmaHora = agora.minusHours(1).format(timeFormatter);
        System.out.println( "Menos uma hora da hora de agora: " + menosUmaHora);

    }
}
