package tag21;

import java.util.Scanner;

public class Tannenbaum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Stufen ein: ");
        int stufen = sc.nextInt();

        tannenBaumBauen(stufen);

        sc.close();
    }

    private static void tannenBaumBauen(int stufen) {

        for (int i = 0; i < stufen; i++) {
            System.out.print(" ");
        }

        System.out.println("*");

        int maxBreite = 0;
        for (int s = 1; s <= stufen; s++) {
            int zeilen = s + 1;

            for (int i = 1; i <= zeilen; i++) {
                int sterne = 2 * i - 1;

                for (int j = 0; j < stufen - s + (zeilen - i); j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < sterne; j++) {
                    System.out.print("*");
                }
                System.out.println();

                if (sterne > maxBreite) {
                    maxBreite = sterne;
                }
            }
        }
    }
}