package tag19.ha.a3;

/*
    Level 1
    Erstellen Sie die Klasse "Song" mit den Attributen
    String "titel", int "dauerSekunden", String "interpret".
    Überschreiben Sie die ToString()-Methode, welche einen String bestehend aus Titel, Interpret und der Dauer im Format Minuten : Sekunden zurückgeben soll.
    Über einen Konstruktor sollen die Attribute initialisiert werden.

    Erstellen Sie in der Main einen Song geben Sie die gespeicherten Informationen mithilfe der toString()-Methode aus.
 */

public class SongApp {
    public static void main(String[] args) {
        System.out.println(new Song("Jingle Bells", 106, "James Lord Pierpont"));
    }
}
