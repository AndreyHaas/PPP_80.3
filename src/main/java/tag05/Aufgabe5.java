package tag05;

import java.util.Scanner;
import java.util.StringJoiner;

/*
START
    GIB AUS "Bitte geben Sie eine ganze Zahl ein: "
    LIES zahl VON EINGABE

    WENN zahl == 0 DANN
        GIB AUS "Die Zahl ist 0."
    SONST
        // Prüfe ob positiv oder negativ
        WENN zahl > 0 DANN
            GIB AUS "Die Zahl ist positiv."
        SONST
            GIB AUS "Die Zahl ist negativ."
        ENDE_WENN

        // Prüfe ob gerade oder ungerade
        WENN zahl % 2 == 0 DANN
            GIB AUS "Die Zahl ist gerade."
        SONST
            GIB AUS "Die Zahl ist ungerade."
        ENDE_WENN
    ENDE_WENN
ENDE
 */
public class Aufgabe5 {

    public static final String nachricht = "Die Zahl ist ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int zahl = Integer.parseInt(scanner.nextLine());
        StringJoiner joiner = new StringJoiner(", ");

        if (zahl == 0) {
            joiner.add(nachricht + 0);
        } else {
            if (zahl % 2 == 0) {
                joiner.add(nachricht + "gerade");
            } else {
                joiner.add(nachricht + "ungerade");
            }

            if (zahl > 0) {
                joiner.add(nachricht + "positiv");
            } else {
                joiner.add(nachricht + "negativ");
            }
        }

        System.out.println(joiner);
    }
}
