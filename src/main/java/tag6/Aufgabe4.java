package tag6;

/*  Level 1

    Das Programm soll mittels einer Schleife „fast“ alle Zahlen zwischen 1 und 100
    (beiderseits einschließlich) auf der Konsole ausgeben.
    Der User hat aber zu Beginn des Programmes die Möglichkeit,
    einen (einzigen) dieser 100 Werte auszuwählen, der nicht ausgegeben werden soll.

    Erstellen Sie zuerst den Pseudocode und anschließend den passenden Java Code.
*/
public class Aufgabe4 {
    public static void main(String[] args) {
        druckeZahlenOhneWert(100, 30);
    }

    private static void druckeZahlenOhneWert(int anzahlWerte, int ausgeschlossenerWert) {

        for (int i = 1; i <= anzahlWerte; i++) {
            if (i == ausgeschlossenerWert) {
                continue;
            }

            System.out.println(i);
        }
    }
}
