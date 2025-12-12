package tag4;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double breiteRechteck;
        double hoeheRechteck;

        System.out.println("Geben Sie breiteRechteck: ");
        breiteRechteck = scanner.nextDouble();

        System.out.println("Geben Sie höheRechteck: ");
        hoeheRechteck = scanner.nextDouble();

        double flaecheRechteck = breiteRechteck * hoeheRechteck;
        System.out.printf("FlächeRechteck ist %.2f %n", flaecheRechteck);
    }
}
