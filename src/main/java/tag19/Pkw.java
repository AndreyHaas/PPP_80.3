package tag19;

import java.util.StringJoiner;

public class Pkw extends Fahrzeug implements Wartbar {

    private final int anzahlTueren;

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public Pkw(String modell, String kennZeichen, int anzahlTueren) {
        super(modell, kennZeichen);
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public void starten() {
        System.out.println("PKW startet ...");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pkw.class.getSimpleName() + "[", "]")
                .add("modell=" + super.getModell())
                .add("kennzeichen=" + super.getKennZeichen())
                .add("anzahlTüren=" + this.getAnzahlTueren())
                .toString();
    }

    @Override
    public void wartungDurchfuehren() {
        System.out.println("Die Wartung des PKW wird durchgeführt.");
    }
}