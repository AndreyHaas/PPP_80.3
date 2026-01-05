package tag04;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grundgebuer;
        double kmAnzahl;
        double einKmPrise;

        System.out.println("Geben Sie bitte die Grundgebuer ein: ");
        grundgebuer = scanner.nextDouble();


        System.out.println("Geben Sie bitte die Anzahl der gefarene Kilometer ein: ");
        kmAnzahl = scanner.nextDouble();

        System.out.println("Geben Sie bitte den Preis pro Kilometer ein: ");
        einKmPrise = scanner.nextDouble();

        double insgesamt = grundgebuer + kmAnzahl * einKmPrise;

        System.out.printf("Bei einer Grundgebuer von %s Euro und einem Kilometerpreis von %s Euro, " +
                "kostet eine %s km lange Taxifahrt insgesamt %s Euro.", grundgebuer, einKmPrise, kmAnzahl, insgesamt);
    }
}
