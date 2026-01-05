package tag14;

import java.util.Scanner;

public class Wochentage {
    public static void main(String[] args) {

        Scanner userEingabe = new Scanner(System.in);

        int tag;

        do {
            System.out.println("Geben Sie die Tagesnummer von 1 bis 7 ein: ");
            tag = Integer.parseInt(userEingabe.nextLine());
        } while (tag < 1 || tag > 7);

        switch (tag) {
            case 1:
                printTagesName("Montag");
                break;
            case 2:
                printTagesName("Dienstag");
                break;
            case 3:
                printTagesName("Mittwoch");
                break;
            case 4:
                printTagesName("Donnerstag");
                break;
            case 5:
                printTagesName("Freitag");
                break;
            case 6:
                printTagesName("Samstag");
                break;
            case 7:
                printTagesName("Sonntag");
                break;
            default:
                System.out.println("Falsches Wert bekommen!");
        }
    }

    private static void printTagesName(String tagesName) {
        System.out.println(tagesName);
    }
}
