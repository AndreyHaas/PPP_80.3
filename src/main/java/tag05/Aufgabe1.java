package tag05;

import java.util.Scanner;

/*
START
    GIB AUS "Geben Sie bitte die erste Zahl ein"
    LIES ersteZahl VON EINGABE

    GIB AUS "Geben Sie bitte die zweite Zahl ein"
    LIES zweiteZahl VON EINGABE

    WENN ersteZahl > zweiteZahl DANN
        maximum = ersteZahl
    SONST
        maximum = zweiteZahl
    ENDE WENN

    GIB AUS "Das Maximum aus " + ersteZahl + " und " + zweiteZahl + " ist " + maximum
ENDE
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ersteZahl;
        int zweiteZahl;
        System.out.println("Geben Sie bitte die erste Zahl ein: ");
        ersteZahl = scanner.nextInt();
        System.out.println("Geben Sie bitte die zweite Zahl ein: ");
        zweiteZahl = scanner.nextInt();

        if (ersteZahl > zweiteZahl) {
            System.out.println("Das Maximum aus " + ersteZahl + " und " + zweiteZahl + " ist " + ersteZahl);
        } else {
            System.out.println("Das Maximum aus " + ersteZahl + " und " + zweiteZahl + " ist " + zweiteZahl);
        }
    }
}
