package tag14;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class JahresZeiten {
    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        int monat;
        String ausgabe = StringUtils.EMPTY;

        do {
            System.out.println("Geben Sie die Monatsnummer von 1 bis 12 ein: ");
            monat = Integer.parseInt(userEingabe.nextLine());
        } while (monat < 1 || monat > 12);

        switch (monat) {
            case 12:
            case 1:
            case 2:
                ausgabe = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                ausgabe = "Fruehling";
                break;
            case 6:
            case 7:
            case 8:
                ausgabe = "Sommer";
                break;
            case 9:
            case 10:
            case 11:
                ausgabe = "Herbst";
                break;
            default:
                System.out.println("Falsches Wert bekommen!");
        }

        System.out.println(ausgabe);
    }
}
