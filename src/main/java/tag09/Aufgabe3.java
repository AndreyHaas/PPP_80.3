package tag09;

import java.util.Random;

/*
Ein Schneider produziert Hemden, Blusen, Hosen und Röcke.
Pro Tag schafft er 15 unterschiedliche Kleidungsstücke (zufällig)
Er arbeitet von Montag bis Freitag.

Die Produktion findet in einer eigenen Methode statt.
Die Ausgabe (in der gleichen Methode), welche  Kleidung hergestellt wurde
soll tageweise erfolgen.

Beispiel:

Montag
---------------
Hemden: 3
Blusen: 7
Hosen: 2
Röcke: 3

Dienstag
---------------
... usw.

 */
public class Aufgabe3 {
    public static void main(String[] args) {
        String[] tage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
        Random generator = new Random();

        for (String tag : tage) {
            drueckeTitel(tag);
            produktGenerator(generator);
        }
    }

    private static void produktGenerator(Random generator) {
        int hemden = 0;
        int blusen = 0;
        int hosen = 0;
        int roecke = 0;
        int count = 0;
        do {
            int generierteWert = generator.nextInt(1, 5);
            if (generierteWert == 1) {
                hemden++;
            } else if (generierteWert == 2) {
                blusen++;
            } else if (generierteWert == 3) {
                hosen++;
            } else {
                roecke++;
            }
            count++;
        } while (count < 15);

        System.out.println("Hemden: " + hemden);
        System.out.println("Blusen: " + blusen);
        System.out.println("Hosen: " + hosen);
        System.out.println("Röcke: " + roecke);
    }

    private static void drueckeTitel(String tag) {
        System.out.println("-------------------");
        System.out.println(tag);
        System.out.println("-------------------");
    }
}