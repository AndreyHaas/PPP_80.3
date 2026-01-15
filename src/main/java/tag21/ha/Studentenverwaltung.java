package tag21.ha;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

/*
Programmieraufgabe – Notenverwaltung (Java)

Ziel dieser Aufgabe ist es, die Grundlagen der strukturierten und objektorientierten
Programmierung in Java zu üben. Das Programm wird als Konsolenanwendung umgesetzt.

Grundidee
Es soll ein Programm entstehen, mit dem Schüler und deren Noten verwaltet werden können. Die
Bedienung erfolgt über ein textbasiertes Menü.

Menü (für alle Stufen)
1. Schüler hinzufügen
2. Note eintragen
3. Alle Schüler anzeigen
4. Statistik anzeigen
5. Beenden

Erstellt eine Klasse Student mit Namen und einem Array für bis zu 10 Noten.
Im Konstruktor wird nur der Name gesetzt, das Array wird mit -1 vorbelegt.
Die Noten sollen dem Oberstufen-Noten folgen, d.h. können Werte von 0 - 15 erhalten
Sie soll eine Methode toString haben, die den Namen und alle eingetragenen Werte (d.h. >= -1) anzeigt.
Möglichst in einheitlicher Form, damit Menü-Punkt 3 eine saubere Liste generiert

Bei Note eintragen muss ein Name des Schülers und eine Note eingegeben werden.
Wird der Name nicht gefunden (Schüler falsch geschrieben oder nicht vorhanden), muss die Eingabe wiederholt werden oder
mit Leereingabe abgebrochen werden. Die Note darf, s.o. nur 0 - 15 sein. Andernfalls wird die Eingabe wiederholt

Der Punkt Statistik soll für alle Studenten einen Durchschnitt berechnen (nur gefüllte Werte zählen!),
sie auflisten und anschließend den Schüler mit dem höchsten und kleinsten Durchschnitt,
sowie den Durchschnitt aller Schüler ausweisen.
 */
public class Studentenverwaltung {
    private static final String KEINE_STUDENTEN_VORHANDEN = "Keine Studenten vorhanden!";
    private static final int MAX_STUDENTEN = 100;
    private static final int MIN_NOTE = 0;
    private static final int MAX_NOTE = 15;

    private Student[] students;
    private int studentsAnzahl;
    private Scanner scanner;

    public Studentenverwaltung() {
        students = new Student[MAX_STUDENTEN];
        studentsAnzahl = 0;
        scanner = new Scanner(System.in);
    }

    private void zeigeMenu() {
        System.out.println("\n=== Studentenverwaltung ===");
        System.out.println("1. Student hinzufügen");
        System.out.println("2. Note eingeben");
        System.out.println("3. Alle Studenten anzeigen");
        System.out.println("4. Statistik anzeigen");
        System.out.println("5. Beenden");
        System.out.print("Wählen Sie eine Menüoption von 1 bis 5: ");
    }

    private void studentHinzufuegen() {
        if (studentsAnzahl >= MAX_STUDENTEN) {
            System.out.println("Maximale Anzahl an Studenten erreicht!");
            return;
        }

        System.out.print("Geben Sie den Namen des Students ein: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name darf nicht leer sein!");
            return;
        }

        for (int i = 0; i < studentsAnzahl; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Ein Student mit diesem Namen existiert bereits!");
                return;
            }
        }

        students[studentsAnzahl] = new Student(name);
        studentsAnzahl++;
        System.out.printf("Student '%s' wurde hinzugefügt.%n", name);
    }

    private @Nullable Student findeEinStudent(String studentName) {
        for (int i = 0; i < studentsAnzahl; i++) {
            if (students[i].getName().equalsIgnoreCase(studentName)) {
                return students[i];
            }
        }

        return null;
    }

    private void noteEingeben() {
        if (studentsAnzahl == 0) {
            System.out.println(KEINE_STUDENTEN_VORHANDEN);
            return;
        }

        while (true) {
            System.out.print("Geben Sie den Namen der Student ein (leer für Abbruch): ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Eingabe war lehr. Abgebrochen.");
                return;
            }

            Student student = findeEinStudent(name);

            if (student == null) {
                System.out.println("Student mit Name '" + name + "' nicht gefunden!");
                System.out.println("Verfügbare Studenten: ");
                alleStudentenAnzeigen();
            } else {
                noteFuerStudentenEingeben(student);
                return;
            }
        }
    }

    private void noteFuerStudentenEingeben(@NotNull Student student) {
        System.out.println("Noteneingabe für Student: " + student.getName());

        if (student.getNotenAnzahl() >= Student.MAX_NOTEN) {
            System.out.printf("Student hat bereits %d Noten. Keine weiteren Noten möglich.%n", Student.MAX_NOTEN);
            return;
        }

        while (true) {
            System.out.print("Geben Sie eine Note ein (0-15, leer für Abbruch): ");
            String eingabe = scanner.nextLine().trim();

            if (eingabe.isEmpty()) {
                System.out.println("Eingabe abgebrochen.");
                return;
            }

            try {
                int note = Integer.parseInt(eingabe);

                if (note >= MIN_NOTE && note <= MAX_NOTE) {
                    if (student.addNote(note)) {
                        System.out.println("Note " + note + " wurde für " + student.getName() + " eingetragen.");
                    } else {
                        System.out.println("Fehler beim Eintragen der Note!");
                    }
                    return;
                } else {
                    System.out.println("Note muss zwischen " + MIN_NOTE + " und " + MAX_NOTE + " liegen!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben.");
            }
        }
    }

    private void alleStudentenAnzeigen() {
        if (studentsAnzahl == 0) {
            System.out.println(KEINE_STUDENTEN_VORHANDEN);
            return;
        }

        System.out.println("\n=== Liste aller Studenten ===");
        System.out.println("Name                 | Noten");
        System.out.println("---------------------|-------------------");

        for (int i = 0; i < studentsAnzahl; i++) {
            System.out.println(students[i].toString());
        }
    }

    private void statistikAnzeigen() {
        if (studentsAnzahl == 0) {
            System.out.println(KEINE_STUDENTEN_VORHANDEN);
            return;
        }

        int studentenMitNoten = 0;

        for (int i = 0; i < studentsAnzahl; i++) {
            if (students[i].getNotenAnzahl() > 0) {
                studentenMitNoten++;
            }
        }

        if (studentenMitNoten == 0) {
            System.out.println("Kein Student hat eine Note bekommen!");
            return;
        }

        System.out.println("\n=== Statistik ===");

        System.out.println("\nDurchschnittsnoten der Studenten:");
        System.out.println("Name                 | Durchschnitt | Anzahl Noten");
        System.out.println("---------------------|--------------|--------------");

        for (int i = 0; i < studentsAnzahl; i++) {
            if (students[i].getNotenAnzahl() > 0) {
                System.out.printf("%-20s | %-12.2f | %-12d%n",
                        students[i].getName(),
                        students[i].berechneDurchschnitt(),
                        students[i].getNotenAnzahl()
                );
            }
        }

        double besterDurchschnitt = -1;
        double schlechtesterDurchschnitt = 16;
        Student besterStudent = null;
        Student schlechtesterStudent = null;
        double gesamtDurchschnitt = 0;
        int studentFuerDurchschnitt = 0;

        for (int i = 0; i < studentsAnzahl; i++) {
            if (students[i].getNotenAnzahl() > 0) {
                double durchschnitt = students[i].berechneDurchschnitt();

                gesamtDurchschnitt += durchschnitt;
                studentFuerDurchschnitt++;

                if (besterStudent == null || durchschnitt > besterDurchschnitt) {
                    besterDurchschnitt = durchschnitt;
//                    besterStudent = Optional.ofNullable(students[i]).orElse(new Student("keinStudent"));
                    besterStudent = students[i];
                }

                if (schlechtesterStudent == null || durchschnitt < schlechtesterDurchschnitt) {
                    schlechtesterDurchschnitt = durchschnitt;
                    schlechtesterStudent = students[i];
                }
            }
        }

        double durchschnittAlle = gesamtDurchschnitt / studentFuerDurchschnitt;

        System.out.println("\n=== Ergebnisse ===");
        if (besterStudent != null) {
            System.out.printf("Student mit dem besten Durchschnitt: %s (%.2f)%n", besterStudent.getName(), besterDurchschnitt);
        }
        if (schlechtesterStudent != null) {
            System.out.printf("Student mit dem schlechtesten Durchschnitt: %s (%.2f)%n",
                    schlechtesterStudent.getName(), schlechtesterDurchschnitt);
        }
        System.out.printf("Durchschnitt aller Studenten: %.2f%n", durchschnittAlle);
        System.out.println("Anzahl der Studenten mit Noten: " + studentenMitNoten);
    }

    public void start() {
        boolean beenden = false;

        while (!beenden) {
            zeigeMenu();

            String auswahl = scanner.nextLine();

            switch (auswahl) {
                case "1" -> studentHinzufuegen();
                case "2" -> noteEingeben();
                case "3" -> alleStudentenAnzeigen();
                case "4" -> statistikAnzeigen();
                case "5" -> {
                    beenden = true;
                    System.out.printf("Ausgewählt %s. Programm wird beendet. Auf Wiedersehen!%n", auswahl);
                }
                default -> System.out.println("Ungültige Auswahl! Bitte von 1 bis 5 wählen.");
            }

            if (!beenden) {
                System.out.println("\nDrücken Sie Enter um fortzufahren...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
