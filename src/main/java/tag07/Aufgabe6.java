package tag07;

public class Aufgabe6 {
    public static void main(String[] args) {
        String[] regal = new String[5];
        regal[0] = "Faust";
        regal[1] = "Die Räuber";
        regal[2] = "Wilhelm Tell";
        regal[3] = "Buddenbrooks";
        regal[4] = "Der Steppenwolf";

        for (int i = 0; i < regal.length; i++) {
            System.out.println("In Zelle Nummer " + i + " Buch \"" + regal[i] + "\"");
        }
    }
}
