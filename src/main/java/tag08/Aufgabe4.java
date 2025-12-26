package tag08;

import java.util.Scanner;

/*  Level 1
    Gegeben ist folgender Pseudocode:

    Beginn
        zahl: int = Eingabe
        summe: int = 0

        Solange zahl > 0
             summe += zahl % 10
             zahl   = zahl / 10
        Ende Solange

        Ausgabe: summe

    Ende

    Setzen Sie den vorgegebenen Programmcode in Java um.

*/
public class Aufgabe4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Wert ein: ");
        int eingabe = scanner.nextInt();

        int summe = 0;

        while (eingabe > 0) {
            summe += eingabe % 10;
            eingabe = eingabe / 10;
        }

        System.out.println(summe);
    }
}
