package tag14;

import java.util.Arrays;
import java.util.Scanner;

public class JahresZeitenMitEnum {
    public enum Monats {
        JANUAR(     1,  "Januar",       "Winter"),
        FEBRUAR(    2,  "Februar",      "Winter"),
        MAERZ(      3,  "März",         "Frühling"),
        APRIL(      4,  "April",        "Frühling"),
        MAI(        5,  "Mai",          "Frühling"),
        JUNI(       6,  "Juni",         "Sommer"),
        JULI(       7,  "Juli",         "Sommer"),
        AUGUST(     8,  "August",       "Sommer"),
        SEPTEMBER(  9,  "September",    "Herbst"),
        OKTOBER(    10, "Oktober",      "Herbst"),
        NOVEMBER(   11, "November",     "Herbst"),
        DEZEMBER(   12, "Dezember",     "Winter");

        Monats(int monatsNummer, String monatsName, String jahresZeit) {
            this.monatsNummer = monatsNummer;
            this.monatsName = monatsName;
            this.jahresZeit = jahresZeit;
        }

        private final int monatsNummer;
        private final String monatsName;
        private final String jahresZeit;

        public static Monats fromMonatsNummer(int nummer) {

            for (Monats monat : Monats.values()) {
                if (monat.monatsNummer == nummer) {
                    return monat;
                }
            }

            throw new IllegalArgumentException("Ungültige Monatsnummer: " + nummer);
        }
    }

    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        int monatsNummer;

        do {
            System.out.println("Geben Sie die Monatsnummer von 1 bis 12 ein: ");
            monatsNummer = Integer.parseInt(userEingabe.nextLine());
        } while (monatsNummer < 1 || monatsNummer > 12);

        try {
            Monats monat = Monats.fromMonatsNummer(monatsNummer);
            System.out.printf("Monat: %s, Jahreszeit: %s", monat.monatsName, monat.jahresZeit);
        } catch (IllegalArgumentException ex) {
            System.out.println("Etwas hat nicht funktioniert. Stacktrace: " + Arrays.toString(ex.getStackTrace()));
        }
    }
}