package tag06;
/*
START
  PRINT "Geben Sie die Anzahl der Räume ein:"
  READ anzahlRaeume

  SET gesamtFlaeche = 0

  FOR i = 1 TO anzahlRaeume
    PRINT "Geben Sie die Länge von Raum " + i + " ein (in m):"
    READ laenge

    PRINT "Geben Sie die Breite von Raum " + i + " ein (in m):"
    READ breite

    SET flaeche = laenge * breite
    SET gesamtFlaeche = flaeche + gesamtFlaeche
  END FOR

  PRINT "Die Gesamtfläche der Wohnung beträgt: " + gesamtFlaeche + " qm"
END
 */
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Anzahl der Räume abfragen
        System.out.print("Geben Sie die Anzahl der Räume ein: ");
        int anzahlRaeume = scanner.nextInt();

        double gesamtFlaeche = 0;

        // Schleife für jeden Raum
        for (int i = 1; i <= anzahlRaeume; i++) {
            System.out.print("Geben Sie die Länge von Raum " + i + " ein (in m): ");
            double laenge = scanner.nextDouble();

            System.out.print("Geben Sie die Breite von Raum " + i + " ein (in m): ");
            double breite = scanner.nextDouble();

            double flaeche = laenge * breite;
            gesamtFlaeche += flaeche;
        }

        // Gesamtfläche ausgeben
        System.out.println("Die Gesamtfläche der Wohnung beträgt: " + gesamtFlaeche + " qm");

        scanner.close();
    }
}
