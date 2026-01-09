package tag17;

import java.util.Scanner;

/*
 Zuerst gibt der User einen beliebigen Text ein.
 Jetzt verschlüsselt der Computer diesen Text. Dabei werden
 die Buchstaben des Users durch Elemente aus dem String-Array "codiert" ersetzt.
 Beispiel: Aus der User-Eingabe "abc" wird der Geheim-Text "dsaddsasdsaw"
 Der verschlüsselte Text wird auf dem Bildschirm ausgegeben.
 Um einen String text in char aufzuteilen, benutzt die Methode text.charAt(i)
 Anschließend wird der verschlüsselte Text vom Computer wieder entschlüsselt.
 NICHT CHEATEN! Eine Ausgabe des Original-Textes zählt nicht :-)
 auch der entschlüsselte Text wird wieder auf dem Bildschirm ausgegeben.
*/
public class Geheimschrift {
    static char buchstaben[] = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', ':', ';', '<', '=', '>', '?', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',',
            '-', '.', '/', ' ', '\\'
    };

    static String codiert[] = {
            "dsad", "dsas", "dsaw", "dsda", "dsdd", "dsds", "dsdw", "dssa", "dssd", "dsss", "dssw", "dswa", "dswd",
            "dsws", "dsww", "dwaa", "dwad", "dwas", "dwaw", "dwda", "dwdd", "dwds", "dwdw", "dwsa", "dwsd", "dwss",
            "daad", "daas", "daaw", "dada", "dadd", "dads", "dadw", "dasa", "dasd", "dass", "dasw", "dawa", "dawd",
            "daws", "daww", "ddaa", "ddad", "ddas", "ddaw", "ddda", "dddd", "ddds", "dddw", "ddsa", "ddsd", "ddss",
            "awaa", "awad", "awas", "awaw", "awda", "awdd", "awds", "awdw", "awsa", "awsd", "awss", "awsw", "awwa",
            "awwd", "awws", "awww", "asad", "asas", "asaw", "asda", "asdd", "asds", "asdw", "assa", "assd", "asss",
            "assw", "aswa", "aswd", "asws", "asww", "asaa", "AAAA"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie das Wort für die Kodierung ein:");

        String userEingabe = scanner.nextLine();
        String kodierteKettenZeichen = kettenZeichenVerschluesseln(userEingabe);

        System.out.printf("Kodiertes wert: %s%n", kodierteKettenZeichen);

        System.out.printf("Dekodiertes wert: %s%n", kettenZeichenDeKodieren(kodierteKettenZeichen));
    }

    private static String kettenZeichenVerschluesseln(String input) {

        String kodiertesKettenzeichen = "";

        for (int i = 0; i < input.length(); i++) {
            char buchstabe = input.charAt(i);
            int buchstabePosition = -1;

            for (int j = 0; j < buchstaben.length; j++) {
                if (buchstaben[j] == buchstabe) {
                    buchstabePosition = j;
                }
            }

            kodiertesKettenzeichen += codiert[buchstabePosition];
        }

        return kodiertesKettenzeichen;
    }

    private static String kettenZeichenDeKodieren(String input) {

        String wort = "";
        String dekodierteString = "";

        for (int i = 0; i < input.length(); i++) {
            wort += input.charAt(i);

            if (wort.length() % 4 == 0) {
                int wortPosition = 0;

                for (int j = 0; j < codiert.length; j++) {
                    if (wort.equals(codiert[j])) {
                        wortPosition = j;
                        wort = "";
                    }
                }

                dekodierteString += buchstaben[wortPosition];
            }
        }

        return dekodierteString;
    }
}