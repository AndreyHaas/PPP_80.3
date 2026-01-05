package tag07;

import java.util.Arrays;
import java.util.Random;
/*
START

  SET generator = neuer Random-Generator
  DEKLARIERE buchstaben[20]
  SET vokaleZahl = 0
  SET asciiStart = 97
  SET asciiEnd = 122

  // Schleife für 20 Buchstaben
  FOR i = 0 BIS 19
    SET asciiZahl = generator.zufallszahl(asciiEnd - asciiStart + 1) + asciiStart
    SET buchstabe = (char)asciiZahl
    buchstaben[i] = buchstabe
        WENN buchstabe ==   buchstaben[97] ODER
                            buchstaben[101] ODER
                            buchstaben[105] ODER
                            buchstaben[111] ODER
                            buchstaben[117]
            DANN vokaleZahl = vokaleZahl + 1
        ENDE_WENN
  ENDE_FOR

  AUSGEBE "Kleine Buchstaben: buchstaben und Zahl von Vokalen: vokaleZahl
END
 */
public class Aufgabe3 {
    public static void main(String[] args) {
        Random generator = new Random();
        char[] kleineBuchstaben = new char[20];
        int vokaleCount = 0;
        int asciiStart = 97;
        int asciiEnd = 122;
        int bereich = asciiEnd - asciiStart + 1;

        for (int i = 0; i < kleineBuchstaben.length; i++) {
            int asciiZahl = generator.nextInt(bereich) + asciiStart;
            if (asciiZahl == 97 || asciiZahl == 101 || asciiZahl == 105 || asciiZahl == 111 || asciiZahl == 117) {
                vokaleCount++;
            }

            kleineBuchstaben[i] = (char) asciiZahl;
        }

        System.out.printf("Kleine Buchstaben: %s und Zahl von Vokalen: %d", Arrays.toString(kleineBuchstaben), vokaleCount);
    }
}
