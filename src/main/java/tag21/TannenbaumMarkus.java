package tag21;

import java.util.Scanner;

public class TannenbaumMarkus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeilen;
        int abstand;

        System.out.print("Geben Sie die Anzahl der Stufen ein: ");
        zeilen = Integer.parseInt(scanner.nextLine());
        abstand = zeilen - 1;

        for (int i = 0; i < zeilen; i++) {
            // Leerzeichen
            for (int j = 0; j < zeilen - i - 1; j++) {
                System.out.print(" ");
            }
            // Sterne
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//
//        for (int i = 1; i <= zeilen; i++) {
//            zeichneBaumTeil(abstand, i);
//        }
    }

//    public static void zeichneBaumTeil(int spaces, int zeilen) {
//        for (int i = 0; i < zeilen; i++) {
//
//            for (int j = 1; j <= spaces - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k < 2 * (i + 1); k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
}
