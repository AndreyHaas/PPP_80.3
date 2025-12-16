package tag7;

import java.util.Arrays;
import java.util.Random;

/*
START

  SET generator = neuer Random-Generator

  DEKLARIERE speicher[20]
  SET summe = 0

  FOR i = 0 BIS 19
    SET eingabe = generator.zufallszahl(1-6)
    speicher[i] = eingabe
    summe = summe + eingabe
  ENDE_FOR

  AUSGEBE "Array: " + speicher

  AUSGEBE "Die Summe lautet: " + summe
  SET durchschnitt = summe / speicher.große(20)
  AUSGEBE "Durchschnitt lautet: " + durchschnitt
END
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] speicher = new int[20];
        int summe = 0;

        for (int i = 0; i < 20; i++) {
            int eingabe = generator.nextInt(6) + 1;
            speicher[i] = eingabe;
            summe += eingabe;
        }

        System.out.println(Arrays.toString(speicher));

        System.out.println("Die summe lautet: " + summe);
        System.out.println("Durchschnitt lautet: " + (double) summe / speicher.length);
    }
}
