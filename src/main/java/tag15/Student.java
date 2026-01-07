package tag15;

import java.util.Scanner;

public class Student {

    private String name;
    private int alter;
    private double notenschnitt;

    public Student(String name, int alter, double notenschnitt) {
        this.name = name;
        this.alter = alter;
        this.notenschnitt = notenschnitt;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public double getNotenschnitt() {
        return notenschnitt;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Alter: " + alter + " | Notenschnitt: " + String.format("%.1f", notenschnitt);
    }
}

class StudentenVerwaltung {
    private static final int MAX_STUDENTEN = 100;
    private static final Student[] STUDENTEN_ARRAY = new Student[MAX_STUDENTEN];
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int anzahlStudenten = 0;

    public static void main(String[] args) {
        boolean programmLaeuft = true;

        while (programmLaeuft) {
            zeigeMenue();
            int auswahl = SCANNER.nextInt(); //!
            SCANNER.nextLine();

            switch (auswahl) {
                case 1:
                    neuenStudentenHinzufuegen();
                    break;
                case 2:
                    alleStudentenAnzeigen();
                    break;
                case 3:
                    durchschnittBerechnen();
                    break;
                case 4:
                    bestenStudentenAnzeigen();
                    break;
                case 5:
                    programmLaeuft = false;
                    System.out.println("Programm wird beendet. Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie 1-5.");
            }
        }
        SCANNER.close();
    }

    private static void zeigeMenue() {
        System.out.println("\n=== Studentenverwaltung ===");
        System.out.println("1. Neuen Studenten hinzufügen");
        System.out.println("2. Alle Studenten anzeigen");
        System.out.println("3. Durchschnitt aller Notenschnitte berechnen");
        System.out.println("4. Besten Studenten anzeigen");
        System.out.println("5. Programm beenden");
        System.out.print("Ihre Auswahl: ");
    }

    private static void neuenStudentenHinzufuegen() {
        if (anzahlStudenten >= MAX_STUDENTEN) {
            System.out.println("Die maximale Anzahl an Studenten wurde erreicht!");
            return;
        }

        System.out.println("\n--- Neuen Studenten hinzufügen ---");

        System.out.print("Name: ");
        String name = SCANNER.nextLine();

        System.out.print("Alter: ");
        int alter = SCANNER.nextInt();

        System.out.print("Notenschnitt (mit Komma als Dezimaltrennzeichen): ");
        double notenschnitt = SCANNER.nextDouble();
        SCANNER.nextLine(); //!

        Student neuerStudent = new Student(name, alter, notenschnitt);
        STUDENTEN_ARRAY[anzahlStudenten] = neuerStudent;
        anzahlStudenten++;

        System.out.println("Student erfolgreich hinzugefügt!");
        System.out.println("Nächster freier Platz: " + anzahlStudenten);
    }

    private static void alleStudentenAnzeigen() {
        if (anzahlStudenten == 0) {
            System.out.println("Keine Studenten vorhanden.");
            return;
        }

        System.out.println("\n--- Alle Studenten ---");
        for (int i = 0; i < anzahlStudenten; i++) {
            System.out.println((i + 1) + ". " + STUDENTEN_ARRAY[i]);
        }
    }

    private static void durchschnittBerechnen() {
        if (anzahlStudenten == 0) {
            System.out.println("Keine Studenten vorhanden.");
            return;
        }

        double summe = 0;
        for (int i = 0; i < anzahlStudenten; i++) {
            summe += STUDENTEN_ARRAY[i].getNotenschnitt();
        }

        double durchschnitt = summe / anzahlStudenten;
        System.out.printf("Durchschnitt aller Notenschnitte: %.2f%n", durchschnitt);
    }

    private static void bestenStudentenAnzeigen() {
        if (anzahlStudenten == 0) {
            System.out.println("Keine Studenten vorhanden.");
            return;
        }

        Student besterStudent = STUDENTEN_ARRAY[0];

        for (int i = 1; i < anzahlStudenten; i++) {
            if (STUDENTEN_ARRAY[i].getNotenschnitt() < besterStudent.getNotenschnitt()) {
                besterStudent = STUDENTEN_ARRAY[i];
            }
        }

        System.out.println("\n--- Bester Student ---");
        System.out.println(besterStudent);
    }
}
