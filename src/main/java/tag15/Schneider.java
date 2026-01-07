package tag15;

import java.util.Scanner;

/*
Erstellen Sie zunächst die Klasse "Mantel".
    Der Mantel hat die privaten Attribute
    - String material
    - int anzahlTaschen
    - boolean hatKnoepfe

    Erstellen Sie die Attribute und (falls erforderlich) Getter und Setter.

    In der Main erzeugen Sie ein Array vom Typ Mantel für 3 Elemente.
    Füllen Sie das Array in einer Schleife mit Mänteln, in welcher der
    User die Daten eingibt. Ein Mantel soll über einen geeigneten
    Konstruktor-Aufruf erstellt werden.

    Geben Sie nun die Mäntel mithilfe einer foreach-Schleife auf
    dem Bildschirm aus. Überschreiben Sie dazu die toString()-Methode
    der Klasse "Mantel".

    ----------------

    создайте массив типа Mantel для 3 элементов.
    Заполните массив в цикле с пальто, в котором
    пользователь вводит данные. Пальто должно быть создано с помощью подходящего
    вызова конструктора.

    Теперь выведите пальто на экран с помощью цикла foreach.
    Для этого перезапишите метод toString() класса «Mantel»

 */
public class Schneider {

    public static void main(String[] args) {
        Scanner userEingabe = new Scanner(System.in);
        System.out.println("Wie viele Mäntel benötigen Sie?");

        Mantel[] mantels = new Mantel[userEingabe.nextInt()];

        for (int i = 0; i < mantels.length; i++) {

            System.out.println("Geben Sie Anzahl fon Taschen " + (i + 1) + " Mantel ein.");
            int anzahlTaschen = userEingabe.nextInt();
            userEingabe.nextLine();

            System.out.println("Geben Sie Material fuer " + (i + 1) + " Mantel ein.");
            String material = userEingabe.nextLine();

            System.out.println("Hat der Mantel Knöpfe? True/False");
            boolean hatKnoepfe = userEingabe.nextBoolean();
            userEingabe.nextLine();

            Mantel mantel = new Mantel(material, anzahlTaschen, hatKnoepfe);
            mantels[i] = mantel;
        }

        for (Mantel mantel : mantels) {
            System.out.println(mantel);
        }
    }

    static class Mantel {
        private String material;
        private int anzahlTaschen;
        private boolean hatKnoepfe;

        public Mantel(String material, int anzahlTaschen, boolean hatKnoepfe) {
            this.material = material;
            this.anzahlTaschen = anzahlTaschen;
            this.hatKnoepfe = hatKnoepfe;
        }

        @Override
        public String toString() {
            return "Mantel{" +
                    "material='" + material + '\'' +
                    ", anzahlTaschen=" + anzahlTaschen +
                    ", hatKnoepfe=" + hatKnoepfe +
                    '}';
        }
    }
}
