package tag7;

/*
START
    SET variable geradeCount, ungeradeCount = 0
    SET speicher: array

    FOR i = 0 BIS 99
        generiere das wert in speicher
        WENN wert %2 == 0 gerade++
            SONNST ungerade++
        ENDE WENN
    ENDE_FOR

    AUSGABE "Im Speicher "geradeCount" von geraden und "ungeradeCount" von ungeraden Zahlen."
END
*/

import java.util.Arrays;
import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
        Random generator = new Random();
        int geradeCount = 0;
        int ungeradeCount = 0;

        int[] speicher = new int[30];

        for (int i = 0; i < speicher.length; i++) {
            int zufallZahl = generator.nextInt(100);
            speicher[i] = zufallZahl;
            if (zufallZahl % 2 == 0) {
                geradeCount++;
            } else {
                ungeradeCount++;
            }
        }

        System.out.println(Arrays.toString(speicher));

        System.out.printf("Im Speicher %d von geraden und %d von ungeraden Zahlen.", geradeCount, ungeradeCount);
    }
}
