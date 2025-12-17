package tag8;

/*  Level 1

	Das Programm zaehlt einen Countdown von 10 bis 0
	Und gibt dann aus - "Ja - die Rakete startet nun"

	Einmal mit For und dann mit While Schleife lösen.

	Pseudocode und lauffähiges Programm in JAVA sind zu erstellen.

	/--------------------------------------------------------------------/
	PSEUDOCODE
Start
    zaehler = 10

    Ausgabe "Zählschleife"
    für (int i = zaehler; i >= 0; i--) -> FOR 10 BIS 0
        Ausgabe i
    endfor
    Ausgabe "Ja - die Rakete startet nun"

    solange zaehler >= 0
        Ausgabe zaehler
        zaehler --
    ende-solange
    Ausgabe "Ja - die 2. Rakete startet auch"
Ende

*/
public class Aufgabe1 {
    public static void main(String[] args) {
        int counter = 10;

        for (int i = counter; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Ja - die 1 Rakete startet nun");


        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Ja - die 2 Rakete startet auch");
    }

}
