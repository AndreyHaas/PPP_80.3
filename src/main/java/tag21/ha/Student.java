package tag21.ha;

public class Student {
    private static final int LEER_NOTE = -1;
    static final int MAX_NOTEN = 10;

    private final String name;
    private final int[] noten;
    private int notenAnzahl;

    public Student(String name) {
        this.name = name;
        this.noten = new int[MAX_NOTEN];
        this.notenAnzahl = 0;

        for (int i = 0; i < MAX_NOTEN; i++) {
            noten[i] = LEER_NOTE;
        }
    }

    public String getName() {
        return name;
    }

    public boolean addNote(int note) {
        if (notenAnzahl >= MAX_NOTEN) {
            return false;
        }

        noten[notenAnzahl] = note;
        notenAnzahl++;
        return true;
    }

    public double berechneDurchschnitt() {
        if (notenAnzahl == 0) {
            return 0.0;
        }

        int summe = 0;

        for (int i = 0; i < notenAnzahl; i++) {
            summe += noten[i];
        }

        return (double) summe / notenAnzahl;
    }

    public int getNotenAnzahl() {
        return notenAnzahl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s | Noten: ", name));

        if (notenAnzahl == 0) {
            sb.append("Keine Noten");
        } else {
            for (int i = 0; i < notenAnzahl; i++) {
                sb.append(String.format("%2d", noten[i]));
            }
        }

        return sb.toString();
    }
}