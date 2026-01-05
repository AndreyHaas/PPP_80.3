package tag06;

import java.util.Scanner;

/*  Level 2

    Schreiben Sie ein Programm, das:
    den Benutzer auffordert 7 Temperaturen (in °C) einzugeben.

    Jede Temperatur soll überprüft werden:
        Wenn die Temperatur größer als 30 ist:
        Gib aus: „Sehr heißer Tag.“
        Wenn die Temperatur zwischen 20 und 30 liegt:
        Prüfe zusätzlich:
            Wenn die Temperatur genau 25 ist, gib aus: „Perfektes Wetter!“
            Sonst: „Angenehm warm.“
        Wenn die Temperatur zwischen 10 und 19 liegt:
        Gib aus: „Kühl.“
        Wenn die Temperatur kleiner als 10 ist:
        Prüfe zusätzlich:
            Wenn die Temperatur unter 0 ist, gib aus: „Eisig kalt!“
            Sonst: „Sehr kalt.“

    Am Ende soll das Programm die Durchschnittstemperatur ausgeben.

    Außerdem soll gezählt werden:
    Wie viele Tage waren heiß (>30)?
    Wie viele Tage waren kalt (<10)?
    Wie viele Tage waren perfekt (=25)?
*/
public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingegebenenTemperature;
        int anzahlEingegebenenTemperaturen = 6;
        int zahlTageUeber30 = 0;
        int zahlPerfWetTage = 0;
        int zahlKaltTage = 0;
        int tempSumme = 0;

        for (int i = 0; i < anzahlEingegebenenTemperaturen; i++) {
            System.out.println("Geben Sie den Temperaturgrad ein: ");
            eingegebenenTemperature = scanner.nextInt();

            if (eingegebenenTemperature > 30) {
                System.out.println("Sehr heißer Tag.");
                zahlTageUeber30++;
                tempSumme += eingegebenenTemperature;
            }

            if (eingegebenenTemperature >= 20 && eingegebenenTemperature <= 30) {
                if (eingegebenenTemperature == 25) {
                    System.out.println("Perfektes Wetter!");
                    zahlPerfWetTage++;
                } else {
                    System.out.println("Angenehm warm.");
                }
                tempSumme += eingegebenenTemperature;
            }

            if (eingegebenenTemperature >= 10 && eingegebenenTemperature <= 19) {
                System.out.println("Kühl");
                tempSumme += eingegebenenTemperature;
            }

            if (eingegebenenTemperature < 10) {
                if (eingegebenenTemperature < 0) {
                    System.out.println("Eisig kalt!");
                } else {
                    System.out.println("Sehr kalt.");
                }
                zahlKaltTage++;
                tempSumme += eingegebenenTemperature;
            }
        }

        System.out.printf("Durchschnittstemperatur: %.2f %n%n", (float) tempSumme / anzahlEingegebenenTemperaturen);
        System.out.println("Anzahl der Tage mit heißem Wetter (>30 Grad): " + zahlTageUeber30);
        System.out.println("Anzahl der Tage mit kaltem Wetter (<10 Grad): " + zahlKaltTage);
        System.out.println("Anzahl der Tage mit optimaler Temperatur (=25 Grad): " + zahlPerfWetTage);
    }
}
