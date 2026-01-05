package tag14;

import java.util.Scanner;

public class GetraenkeAutomatApp {
    public static void main(String[] args) {

        GetraenkeAutomat automat = new GetraenkeAutomat();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Getränkeautomaten!");

        int userAuswahl;
        double price;
        double zwischenSumme = 0;
        double gesamtSumme = 0;

        do {
            automat.zeigeMenue();
            System.out.println("Ihre Auswahl (0 zum Beenden): ");
            userAuswahl = Integer.parseInt(scanner.nextLine());

            if (userAuswahl < 0 || userAuswahl > 5) {
                System.out.println("Ungültige Auswahl! Bitte von 0 bis 5 eingeben.");
            } else if (userAuswahl != 0) {
                price = automat.waehleGetraenk(userAuswahl);
                zwischenSumme += price;
                System.out.println("Zwischensumme: " + zwischenSumme + " Euro");
            }
        } while (userAuswahl != 0);

        gesamtSumme += zwischenSumme;

        belegAusdruecken(gesamtSumme);

        scanner.close();
    }

    private static void belegAusdruecken(double gesamtSumme) {
        String begrenzer = "*******************************";
        System.out.println(begrenzer);

        System.out.println("Vielen Dank für Ihren Einkauf!\n");
        System.out.printf("Gesamtsumme: %.2f Euro%n%n", gesamtSumme);
        System.out.println("Auf Wiedersehen!");

        System.out.printf(begrenzer + "\n");
    }
}