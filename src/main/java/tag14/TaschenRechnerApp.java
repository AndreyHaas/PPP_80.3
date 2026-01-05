package tag14;

import java.util.Scanner;

public class TaschenRechnerApp {
    public static void main(String[] args) {

        TaschenRechner rechner = new TaschenRechner();
        rechner.zeigeMenue();

        Scanner userEingabe = new Scanner(System.in);

        char userOperator = userEingabe.nextLine().charAt(0);
        boolean istUntrstuetzteOperation = false;

        char[] unterstuetzteOperatoren = {'/', '*', '-', '+', '%'};

        for (char operator : unterstuetzteOperatoren) {
            if (userOperator == operator) {
                istUntrstuetzteOperation = true;
                break;
            }
        }

        if (userOperator == 48) { // '0'=48
            closeAndExit("Der Rechenprozess wird nicht benötigt. Beende den Taschenrechner.", userEingabe, 0);
        }

        if (!istUntrstuetzteOperation) {
            closeAndExit("Nicht unterstützte Operation.", userEingabe, 0);
        }

        if (istUntrstuetzteOperation) {
            System.out.println("Geben Sie die erste Zahl ein:");
            int ersteZahl = userEingabe.nextInt();

            System.out.println("Geben Sie die zweite Zahl ein:");
            int zweiteZahl = userEingabe.nextInt();

            rechner.umrechnen(userOperator, ersteZahl, zweiteZahl);
        }
    }

    private static void closeAndExit(String message, Scanner scanner, int status) {
        System.out.println(message);
        scanner.close();
        System.exit(status);
    }
}