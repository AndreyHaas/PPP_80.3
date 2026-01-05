package tag06;

/*  Level 1

    Gegeben ist folgender Pseudocode:

    {
        Für (i = 0, i < 10, i++)
        {
            Wenn (i ist gerade)
            {
                Ausgabe: "Die Zahl " + i + " ist gerade."
            }
            Sonst
            {
                Ausgabe: "Die Zahl " + i + " ist ungerade."
            }
        }
    }

    Setzen Sie das gegebene Programm in Java um.
*/
public class Aufgabe1 {

    public static final String DIE_ZAHL_IST = "Die Zahl %d ist %s.%n";
    public static final String GERADE = "gerade";
    public static final String UNGERADE = "ungerade";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.printf(DIE_ZAHL_IST, i, GERADE);
            } else {
                System.out.printf(DIE_ZAHL_IST, i, UNGERADE);
            }
        }
    }
}
