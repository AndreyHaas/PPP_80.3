package tag06;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Zahlen möchten Sie eingeben? ");
        int anzahl = scanner.nextInt();

        if (anzahl <= 0) return;

        System.out.print("Geben Sie Zahl 1 ein: ");
        int ersteZahl = scanner.nextInt();

        int kleinste = ersteZahl;
        int groesste = ersteZahl;

        for (int i = 2; i <= anzahl; i++) {
            System.out.print("Geben Sie Zahl " + i + " ein: ");
            int aktuelleZahl = scanner.nextInt();

            if (aktuelleZahl < kleinste) {
                kleinste = aktuelleZahl;
            }

            if (aktuelleZahl > groesste) {
                groesste = aktuelleZahl;
            }
        }

        System.out.println("Die kleinste Zahl ist: " + kleinste);
        System.out.println("Die größte Zahl ist: " + groesste);

        scanner.close();
    }
}