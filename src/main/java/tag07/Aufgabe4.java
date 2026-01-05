package tag07;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe4 {
    public static void main(String[] args) {

        Random generator = new Random();
        int maxZahl = 0;
        int tmpZahl = 0;
        int[] sitzReihe = new int[45];

        for (int i = 0; i < sitzReihe.length; i++) {
            int zufallszahl = generator.nextInt(2);
            sitzReihe[i] = zufallszahl;

            if (zufallszahl == 0) {
                tmpZahl++;
                if (maxZahl < tmpZahl) {
                    maxZahl = tmpZahl;
                }
            } else {
                tmpZahl = 0;
            }
        }

        System.out.println(Arrays.toString(sitzReihe));

        System.out.println("Groeste Anzahl an freien nebeneinander liegenden Sitzen war: " + maxZahl);
    }
}
