package tag08;

import java.util.Scanner;

/*
START
    // 1. Eingabe der Rechteckmaße
    GIB AUS "Bitte geben Sie die Breite des Rechtecks ein: "
    LIES breite VON EINGABE

    GIB AUS "Bitte geben Sie die Länge des Rechtecks ein: "
    LIES laenge VON EINGABE

    // 2. Fläche berechnen
    flaeche = breite * laenge

    // 3. Initialisierung
    versuche = 0
    antwort = 0

    // 4. Schleife zur Abfrage
    WIEDERHOLE
        versuche = versuche + 1

        GIB AUS "Was ist die Fläche des Rechtecks? "
        LIES antwort VON EINGABE

        WENN antwort != flaeche DANN
            GIB AUS "Falsch! Versuchen Sie es erneut."
        ENDE_WENN

    SOLANGE antwort != flaeche

    // 5. Ergebnisausgabe
    GIB AUS "Richtig! Die Fläche ist " + flaeche
    GIB AUS "Sie benötigten " + versuche + " Versuche."
ENDE
 */
public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Breite des Rechtecks ein: ");
        int breite = scanner.nextInt();

        System.out.print("Bitte geben Sie die Länge des Rechtecks ein: ");
        int laenge = scanner.nextInt();

        int flaeche = breite * laenge;

        int versuche = 0;
        int antwort;

        System.out.println("\n--- Flächenberechnung ---");

        do {
            versuche++;

            System.out.print("Was ist die Fläche des Rechtecks? ");
            antwort = scanner.nextInt();

            if (antwort != flaeche) {
                System.out.println("Falsch! Versuchen Sie es erneut.\n");
            }

        } while (antwort != flaeche);


        System.out.println("\nRichtig! Die Fläche ist " + flaeche);
        System.out.println("Sie benötigten " + versuche + " Versuche.");

        scanner.close();
    }
}
