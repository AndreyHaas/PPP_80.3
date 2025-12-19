package tag10;

import java.util.Scanner;

public class Aufgabe1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Anfrage einer Dezimalzahl
            System.out.print("Geben Sie eine Zahl im Dezimalsystem ein (0 zum Beenden): ");
            int decimalNumber = scanner.nextInt();

            // Ausgangskontrolle
            if (decimalNumber == 0) {
                System.out.println("Das Programm wurde beendet.");
                break;
            }

            // Antrag auf neue Grundlage
            System.out.print("Geben Sie die Basis des Zahlensystems ein (2-36): ");
            int targetBase = scanner.nextInt();

            // Überprüfung der Richtigkeit der Begründung
            if (targetBase < 2 || targetBase > 36) {
                System.out.println("Die Basis muss zwischen 2 und 36 liegen.");
                continue;
            }

            // Konvertierung und Ausgabe des Ergebnisses
            String converted = convertBase(decimalNumber, targetBase);
            System.out.printf("%d in Dezimal = %s im System mit der Basis %d%n%n",
                    decimalNumber, converted, targetBase);
        }

        scanner.close();
    }


    /**
     * Methode zur Umwandlung einer Dezimalzahl in ein System mit beliebiger Basis
     *
     * @param number – Dezimalzahl
     * @param base   – Zielbasis (2-36)
     * @return Zeichenfolgenrepräsentation der Zahl im neuen System
     */
    public static String convertBase(int number, int base) {
        // Für negative Zahlen fügen wir ein Minuszeichen hinzu.
        if (number < 0) {
            return "-" + convertBase(-number, base);
        }

        // Für die Zahl 0
        if (number == 0) {
            return "0";
        }

        // Zeichenmenge für Zahlen in Systemen mit einer Basis > 10
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        // Konvertierung mithilfe der Division mit Rest
        int n = number;
        while (n > 0) {
            int remainder = n % base;
            result.insert(0, digits.charAt(remainder));
            n /= base;
        }

        return result.toString();
    }
}
