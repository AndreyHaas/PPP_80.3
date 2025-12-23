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

    public Song(){}

    public Song(String title, int dauerSekunden, String interpret) {
        this.title = title;
        this.dauerSek = dauerSekunden;
        this.interpret = interpret;
    }

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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Song that)) return false;

        return dauerSek == that.dauerSek && title.equals(that.title) && interpret.equals(that.interpret);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + dauerSek;
        result = 31 * result + interpret.hashCode();
        return result;
    }

    public void spielen() {
        System.out.println(
                "Song: " + getTitle() + ", Interpret: " + getInterpret() + ", dauer: " + zeitConverter(getDauerSek()));
    }

    private String zeitConverter(int sek) {
        return String.format("%02d:%02d", sek / 60, sek % 60);
    }
}
