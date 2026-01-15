package tag21;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Wir sollen ein Programm schreiben, dass nach der Eingabe eines Radius und einer Höhe
    das Volumen und die Oberfläche eines Zylinders berechnet.
    Die Formeln für die Berechnung kennt der Auftraggeber nicht, sichert aber zu, die
    notwendige Recherche zu vergüten. ;-)

    Erstellt einen Pseudo-Code und anschließend ein lauffähiges Java-Programm

    kreisFläche = Pi * radius * radius
    volumen = kreisFläche * höhe

    kreisumfang = 2 * Pi * radius
    mantelFläche = kreisumfang * höhe

    oberFläche = 2 * kreisFläche + mantelFläche
 */
public class Zylinder {
    public static void main(String[] args) {
        boolean erfolgreich = false;

        try (Scanner scanner = new Scanner(System.in)) {

            int radius = lesePositiveZahl(scanner, "Radius");
            int hoehe = lesePositiveZahl(scanner, "Höhe");

            double volumen = berechneVolumen(radius, hoehe);
            double oberflaeche = berechneOberflaeche(radius, hoehe);

            System.out.printf("%nErgebnisse:%n");
            System.out.printf("Radius:     \t%d%n", radius);
            System.out.printf("Höhe:       \t%d%n", hoehe);
            System.out.printf("Volumen:    \t%.2f%n", volumen);
            System.out.printf("Oberfläche: \t%.2f%n", oberflaeche);

            erfolgreich = true;

        } catch (Exception e) {
            System.out.println("Programm wurde aufgrund eines Fehlers beendet: " + e.getMessage());
        }

        if (erfolgreich) {
            System.out.println("\nBerechnung erfolgreich abgeschlossen!");
        }
    }

    private static int lesePositiveZahl(@NotNull Scanner scanner, String bezeichnung) {
        while (true) {
            try {
                System.out.printf("Geben Sie %s ein (positive ganze Zahl): ", bezeichnung);
                int wert = scanner.nextInt();

                if (wert <= 0) {
                    System.out.println("Fehler: Der Wert muss positiv sein!");
                    continue;
                }

                return wert;

            } catch (InputMismatchException e) {
                System.out.println("Fehler: Bitte geben Sie eine ganze Zahl ein!");
                scanner.nextLine();
            }
        }
    }

    public static double berechneVolumen(int radius, int hoehe) {
        return Math.PI * radius * radius * hoehe;
    }

    public static double berechneOberflaeche(int radius, int hoehe) {
        return 2 * Math.PI * radius * (radius + hoehe);
    }
}