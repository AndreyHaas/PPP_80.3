package tag03.hausaufgabe;

import java.util.Random;

public class Hausaufgabe1 {
    public static void main(String[] args) {
        zahlenGenerator(6);
    }

    private static void zahlenGenerator(int wieVielZahlen) {
        Random random = new Random();

        for (int i = 0; i < wieVielZahlen; i++) {
            int zahl = random.nextInt(100);
            System.out.printf("%s. Zahl: %d %n", i + 1, zahl);
        }
    }
}
