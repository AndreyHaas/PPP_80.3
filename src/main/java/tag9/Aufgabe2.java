package tag9;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner unserEingabe = new Scanner(System.in);
        String[] names = getNames(unserEingabe);
        begruessung(names);
    }

    private static String[] getNames(Scanner unserEingabe) {
        System.out.println("Wie viel Menschen willst du begrüßen? ");
        int menschenAnzahl = unserEingabe.nextInt();
        unserEingabe.nextLine();

        String[] names = new String[menschenAnzahl];

        for (int i = 0; i < menschenAnzahl; i++) {
            System.out.println("Gebe ein " + (i + 1) + ". Person ein:");
            String name = unserEingabe.nextLine();
            names[i] = name;
        }

        return names;
    }

    private static void begruessung(String... names) {
        for (String name : names) {
            System.out.println("Hallo, " + name);
        }
    }
}

