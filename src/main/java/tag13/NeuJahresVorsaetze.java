package Jahr2026;

import java.util.Scanner;

public class NeuJahresVorsaetze {

    public static void main(String[] args) {

        System.out.println("Gib einen Vorsatz ein");
        Scanner scanner = new Scanner(System.in);

        Vorsatz trinken = new Vorsatz("trinken");
        Vorsatz sport = new Vorsatz("sport");
        Vorsatz schlafen = new Vorsatz("schlafen");
        Vorsatz variabel = new Vorsatz(scanner.nextLine());

        trinken.showStatus();
        sport.showStatus();
        schlafen.showStatus();
        variabel.showStatus();

        trinken.markAsDone();

        System.out.println("\nNach dem Erledigen:\n");

        trinken.showStatus();
        sport.showStatus();
        schlafen.showStatus();
        variabel.showStatus();

    }

}
