package tag8;
/*

Der Computer stellt dem User 5 Rechenaufgaben. Dazu werden zunächst die
beiden Zahlen (jeweils zwischen 1 und 10) zufällig ermittelt. Im nächsten
Schritt ermittelt der Computer zufällig, welche Rechenoperation benutzt werden soll.
Zur Verfügung stehen:
    Addition (+)
    Subtraktion (-)
    Multiplikation (*)
    Division (/) (nur, wenn das Ergebnis ohne Nachkommastellen ist) Bsp.: 6/3 .. 8/2 .. etc..
    Modulo (%)

Nach jeder Aufgabe erhält der User eine Information.
Hat er richtig gerechnet, reicht ein "Prima" oder so :-)
hat er falsch gerechnet, wird ein "Leider falsch" zusammen mit der richtigen Lösung ausgegeben.

Hat der User alle 5 Aufgaben bearbeitet, wird die Anzahl der korrekt bearbeiteten Aufgaben
ausgegeben.

Ergänzung: (für Runaways) der Computer fragt am Anfang, wie viele Rechenaufgaben gestellt werden sollen und passt die Schleife entsprechend an
 			              am Ende berechnet der Computer, wie viel % der Aufgaben richtig gerechnet wurden
 */

import java.util.Random;
import java.util.Scanner;

public class Aufgabe5 {

    public static final String RECHNEN_STRING = "%d %s %d = ";

    public static void main(String[] args) {
        Random generator = new Random();
        Scanner userEingabe = new Scanner(System.in);
        int korrektAntwort = 0;
        int result;
        System.out.println("Wie viel Aufgaben willst du rechnen? ");
        int aufgabenZahl = userEingabe.nextInt();

        for (int i = 0; i < aufgabenZahl; i++) {
            char[] rechenOps = {'+', '-', '*', '/', '%'};
            int ersteZahl = generator.nextInt(1, 11);
            int zweiteZal = generator.nextInt(1, 11);
            //Rechenoperation generator
            char generierteOperation = rechenOps[generator.nextInt(0, 5)];

            if (generierteOperation == '+') {
                result = ersteZahl + zweiteZal;
            } else if (generierteOperation == '-') {
                result = ersteZahl - zweiteZal;
            } else if (generierteOperation == '*') {
                result = ersteZahl * zweiteZal;
            } else if (generierteOperation == '%') {
                result = ersteZahl % zweiteZal;
            } else {
                if (ersteZahl % zweiteZal != 0) {
                    do {
                        ersteZahl = generator.nextInt(1, 11);
                        zweiteZal = generator.nextInt(1, 11);
                    } while (ersteZahl % zweiteZal != 0);
                }
                result = ersteZahl / zweiteZal;
            }
            System.out.printf(RECHNEN_STRING, ersteZahl, generierteOperation, zweiteZal);

            if (result == userEingabe.nextInt()) {
                korrektAntwort++;
                System.out.println("Prima");
            } else {
                System.out.println("Leider falsch. Richtige Antwort war: " + result);
            }
        }

        System.out.println("Anzahl der richtigen Antworten: " + korrektAntwort);
        System.out.printf("Sie haben %.2f%% der Fragen richtig beantwortet.%n", (double) korrektAntwort / aufgabenZahl * 100);
    }
}
