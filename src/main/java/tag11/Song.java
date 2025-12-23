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
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public Song(){};

    public Song(String titel, int dauerSekunden, String interpret) {
        this.titel = titel;
        this.dauerSekunden = dauerSekunden;
        this.interpret = interpret;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getDauerSekunden() {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden) {
        this.dauerSekunden = dauerSekunden;
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

        return dauerSekunden == that.dauerSekunden && titel.equals(that.titel) && interpret.equals(that.interpret);
    }

    @Override
    public int hashCode() {
        int result = titel.hashCode();
        result = 31 * result + dauerSekunden;
        result = 31 * result + interpret.hashCode();
        return result;
    }

    public void spielen() {
        System.out.println(
                "Song: " + getTitel() + ", Interpret: " + getInterpret() + ", dauer: " + umwandlung(getDauerSekunden()));
    }

    private String umwandlung(int sekunden) {
        return String.format("%02d:%02d", sekunden / 60, sekunden % 60);
    }
}
