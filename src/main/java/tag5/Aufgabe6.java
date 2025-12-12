package tag5;

import java.util.Scanner;

/*  Level 2

     Erstellen Sie ein Java Programm, das als einfacher Taschenrechner fungiert.
     Das Programm soll den Benutzer nach zwei Zahlen und einem mathematischen Operator fragen, die entsprechende Berechnung durchführen und das Ergebnis ausgeben.

Detaillierte Anforderungen:

    Benutzereingabe: Der Benutzer soll nacheinander zwei Zahlen eingeben, gefolgt von einem mathematischen Operator.

    Unterstützte Operatoren:
        Addition (+)
        Subtraktion (-)
        Multiplikation (*)
        Division (/)

    Verzweigungen: Verwenden Sie if-else-Verzweigungen, um die eingegebene Operation zu bestimmen und die entsprechende Berechnung durchzuführen.

    Ergebnisdarstellung: Das Ergebnis der Berechnung soll auf der Konsole ausgegeben werden.

    Fehlerbehandlung: Implementieren Sie eine einfache Fehlerbehandlung für folgende Fälle:
        Ungültiger Operator: Wenn der Benutzer einen anderen Operator als die unterstützten (+, -, *, /) eingibt, soll eine Fehlermeldung ausgegeben werden.
        Division durch Null: Wenn der Benutzer versucht, durch Null zu dividieren, soll eine entsprechende Fehlermeldung ausgegeben werden, da dies zu einem mathematischen Fehler führt.

Beispiel für die Benutzereingabe und -ausgabe:

    Der Benutzer gibt die erste Zahl ein: 8
    Der Benutzer gibt die zweite Zahl ein: 2
    Der Benutzer gibt den Operator ein: +
    Das Programm gibt das Ergebnis aus: Ergebnis: 10.0

*/
public class Aufgabe6 {
    public static void main(String[] args) {
        int ersteZahl;
        int zweiteZahl;
        String operator;
        float ergebnis;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie bitte erste Zahl ein: ");
        ersteZahl = Integer.parseInt(scanner.nextLine());
        System.out.println("Geben sie bitte zweite Zahl ein: ");
        zweiteZahl = Integer.parseInt(scanner.nextLine());
        System.out.println("Geben sie bitte operator ein: ");
        operator = scanner.nextLine();

        int[] zahlen = {10, 20, 30, 40, 50};
        for (int i = 5; i > zahlen.length; i--) {
            System.out.println();
        }

        try {
            if (operator.equals("+")) {
                ergebnis = ersteZahl + zweiteZahl;
            } else if (operator.equals("-")) {
                ergebnis = ersteZahl - zweiteZahl;
            } else if (operator.equals("/")) {
                ergebnis = ersteZahl / zweiteZahl;
            } else if (operator.equals("*")) {
                ergebnis = ersteZahl * zweiteZahl;
            } else {
                throw new IllegalArgumentException("Operator wird nicht unterstützt. Unterstützt werden „+“, „-“, „*“ und „/“.");
            }
            System.out.println(ergebnis);
        } catch (IllegalArgumentException | ArithmeticException ex) {
            String localizedMessage = ex.getLocalizedMessage();
            if (localizedMessage.contains("by zero")) {
                System.out.println("Division durch NULL ist nach den Regeln der Mathematik nicht möglich!!!");
            }
        }
    }
}
