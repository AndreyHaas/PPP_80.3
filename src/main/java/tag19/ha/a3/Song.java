package tag19.ha.a3;

import java.util.StringJoiner;

public class Song {

    private final String titel;
    private final int dauerSekunden;
    private final String interpret;

    public Song(String titel, int dauerSekunden, String interpret) {
        this.titel = titel;
        this.dauerSekunden = dauerSekunden;
        this.interpret = interpret;
    }

    public String getTitel() {
        return titel;
    }

    public int getDauerSekunden() {
        return dauerSekunden;
    }

    public String getInterpret() {
        return interpret;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Song.class.getSimpleName() + "[", "]")
                .add("titel= '" + getTitel() + "'")
                .add("interpret= '" + getInterpret() + "'")
                .add("dauer= " + getDauerSekunden() / 60 + ":" + getDauerSekunden() % 60)
                .toString();
    }
}