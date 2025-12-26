package tag11;
/* Level 1
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 * Erstellen Sie außerdem ein UML Klassendiagramm für die Klasse "Song".
 */

public class Song {
    private String title;
    private int dauerSek;
    private String interpret;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDauerSek() {
        return dauerSek;
    }

    public void setDauerSek(int dauerSek) {
        this.dauerSek = dauerSek;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    /**
     * Gibt info ueber das Spiel
     */
    public String spielen() {
        return
                "Song: " + getTitle() + ", Interpret: " + getInterpret() + ", Dauer: " + zeitConverter(getDauerSek());
    }

    private String zeitConverter(int sek) {

        int minuten = sek / 60;
        int sekunden = sek % 60;
        return String.format("%02d:%02d", minuten, sekunden);
    }
}
