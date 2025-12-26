package tag03.hausaufgabe;

public class Hausaufgabe2 {
    public static void main(String[] args) {
        kubusWertenDruecken(3.75F);
    }

    private static void kubusWertenDruecken(float kantenlaengeKubus) {
        double volumen = Math.pow(kantenlaengeKubus, 3); // V = a^3
        double oberflaeche = 6 * Math.pow(kantenlaengeKubus, 2); // S = 6a^2

        System.out.println("*****************************************");
        System.out.printf("*    Ergebnisse für Kantenlänge %.2f    *%n", kantenlaengeKubus);
        System.out.println("*****************************************");
        System.out.println();
        System.out.printf("Oberfläche: %.2f %n", oberflaeche);
        System.out.printf("Volumen:    %.2f %n", volumen);
    }
}
