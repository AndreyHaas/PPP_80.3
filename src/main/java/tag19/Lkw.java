package tag19;

import java.util.StringJoiner;

public class Lkw extends Fahrzeug implements Wartbar {

    private final int tragfaehigkeit;

    public Lkw(String modell, String kennZeichen, int tragfaehigkeit) {
        super(modell, kennZeichen);
        this.tragfaehigkeit = tragfaehigkeit;
    }

    @Override
    public void starten() {
        System.out.println("LKW startet ...");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Lkw.class.getSimpleName() + "[", "]")
                .add("modell=" + super.getModell())
                .add("kennzeichen=" + super.getKennZeichen())
                .add("tragfähigkeit=" + this.tragfaehigkeit)
                .toString();
    }

    @Override
    public void wartungDurchfuehren() {
        System.out.println("Die Wartung des LKW wird durchgeführt.");
    }
}