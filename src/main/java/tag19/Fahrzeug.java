package tag19;

import java.util.StringJoiner;

public class Fahrzeug {
    private final String modell;
    private final String kennZeichen;

    public Fahrzeug(String modell, String kennZeichen) {
        this.modell = modell;
        this.kennZeichen = kennZeichen;
    }

    public String getModell() {
        return modell;
    }

    public String getKennZeichen() {
        return kennZeichen;
    }

    public void starten() {
        System.out.println("Das Fahrzeug startet ...");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Fahrzeug.class.getSimpleName() + "[", "]")
                .add("modell=" + getModell())
                .add("kennZeichen=" + getKennZeichen())
                .toString();
    }
}