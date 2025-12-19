package tag10;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber;
        System.out.print("Geben Sie eine Dezimalzahl ein (0 zum Beenden): ");
        String userInput = scanner.nextLine();

        do {
            decimalNumber = Integer.parseInt(userInput);
            if (decimalNumber > 0) {
                System.out.print("Geben Sie den Basis (2-36) ein: ");
                int base = Integer.parseInt(scanner.nextLine());

                if (base < 2 || base > 36) {
                    System.out.println("Ungueltige Basis!");
                    continue;
                }
                String result = Integer.toString(decimalNumber, base).toUpperCase();
                System.out.printf("Ergebnis: %s%n%n", result);
            }
        } while (decimalNumber == 0);

        scanner.close();
    }
}