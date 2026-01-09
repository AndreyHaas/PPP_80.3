package tag16;
/*
    Erstellt ein Programm, dass ein Array mit 1000 Zahlen füllt (von 1 - 100.000), sortiert es und lasst eine zufällige
    Zahl aus dem Array ausgeben.

    Anschließend soll ein Binärer Suchalgorithmus die Speicherstelle finden, an der der Wert steht.,

    zahl[1000], per Random mit zahlen von 1 - 100.000 füllen,
    anschließend sortieren (ohne ausgabe!)
    Gebt anschließen die Zahl zahl[Random(0,1000)] aus (ohne die Position auszugeben!!!)

    Übergebt diesen Wert einem Suchalgorithmus, der die Position der Zahl im Array ermittelt.

    Ergänzung: Gebt z.B. -1 aus, für den Fall, dass eine Zahl nicht im Array ist.
 */

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

/*
    PSEUDOCODE Binäre Suche

    START
        erhalte Suchwert und Array (als Parameter)
        firstPos = 0
        lastPos  = Array.length
        gefunden = false
        position = -1

        solange !gefunden && firstPost <= lastPos
            aktPos   = (firstPos + lastPos) / 2   // Integer!!!
            wenn Array[aktPos] == Suchwert
               gefunden = true
               position = aktPos
            sonst
               wenn Array[aktPos] < Suchwert
                  firstPos = aktPos + 1
               sonst
                  lastPos  = aktPos - 1

    ENDE
 */
public class BinaereSuche {

    static int arrayGrosse = 1000;

    public static void main(String[] args) {

        int[] array = new int[arrayGrosse];

        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100000) + 1;
        }

        Arrays.sort(array);

        int suchwert = array[generator.nextInt(1000) + 1];

        System.out.printf("%nWir suchen den Wert '%d' im Array%n", suchwert);

        System.out.println(getSuchWertPosition(array, 50000));
        System.out.println(getSuchWertPosition(array, suchwert));
    }

    private static int getSuchWertPosition(int @NotNull [] array, int suchWert) {

        int firstPos = 0;
        int lastPos = array.length;
        int aktuellePosition;
        int suchWertPosition = -1;

        boolean istGefunden = false;

        while (!istGefunden && firstPos <= lastPos) {

            for (int i = 0; i < array.length; i++) {
                aktuellePosition = (firstPos + lastPos) / 2;
                if (array[i] == suchWert) {
                    istGefunden = true;
                    suchWertPosition = i;
                    break;
                } else {
                    if (array[aktuellePosition] < suchWert) {
                        firstPos = aktuellePosition + 1;
                    } else {
                        lastPos = aktuellePosition - 1;
                    }
                }
            }
        }

        if (suchWertPosition != -1) {
            System.out.printf("Suchbegriff '%d' befindet sich an der Position '%d'%n", suchWert, suchWertPosition);
        } else {
            System.out.println("Suchbegriff nicht gefunden\n");
        }

        return suchWertPosition;
    }
}
