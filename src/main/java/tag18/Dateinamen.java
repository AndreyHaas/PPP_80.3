package tag18;

import java.util.Scanner;

/*
    Ein Programm soll jeden Tag eine Datei einlesen.
    Um die Dateien voneinander unterscheiden zu können, haben sie folgenden Namensaufbau (Nomenklatur)
    Import_yyyymmdd.csv
    dabei stehen yyyy für die Jahreszahl, mm für den Monat (zweistellig) und dd für den Tag (ebenfalls zweistellig)

    Der Benutzer soll Jahr, Monat und Tag als Integer(!!!) eingeben, eine Methode baut daraus den richtigen Dateinamen,
    den das Hauptprogramm dann anzeigt.

    Die Daten sind auf Richtigkeit zu prüfen und notfalls abzuweisen. (d.h. kein 31.04 oder 30.02)

    Der Benutzer darf Monat und oder Tag weglassen. Sie werden dann jeweils mit dem Höchstwert vorbelegt.

    Beispiele:
    2025
    05
    17
    Dateiname: Import_20250517

    2024
    0
    0
    Dateiname: Import20241231

    2023
    0
    22
    Dateiname: Import20231222

    2022
    02
    0
    Dateiname: Import20220228 (!)
 */
public class Dateinamen {
    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);

        int jahr;
        do {
            System.out.println("Geben sie Jahr ein (4 Zeichen): ");
            jahr = userEingabe.nextInt();
        } while (String.valueOf(jahr).length() != 4);


        System.out.println("Geben sie Monat ein: ");
        int monat = userEingabe.nextInt();

        System.out.println("Geben sie Tag ein: ");
        int tag = userEingabe.nextInt();

        System.out.println(getValidResultString(jahr, monat, tag));

        userEingabe.close();
    }

    private static String getValidResultString(int jahr, int monat, int tag) {
        if (monat < 0 || monat > 12) {
            throw new IllegalArgumentException("Ungültiger Monat");
        }

        if (monat == 0) {
            monat = 12;
        }

        int maxTag = getMaxTagInMonat(jahr, monat);

        if (tag == 0) {
            tag = maxTag;
        }

        if (tag < 1 || tag > maxTag) {
            throw new IllegalArgumentException("Ungültiger Tag");
        }

        return "Import_" + jahr
                + String.format("%02d", monat)
                + String.format("%02d", tag);
    }

    static boolean istSchaltJahr(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    static int getMaxTagInMonat(int jahr, int monat) {
        return switch (monat) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> istSchaltJahr(jahr) ? 29 : 28;
            default -> throw new IllegalArgumentException("Ungültiger Monat");
        };
    }
}
