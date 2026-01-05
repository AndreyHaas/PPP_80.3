package tag03;

public class Hausaufgabe3 {
    public static void main(String[] args) {

        int wieVielJahren = 5;
        double kapital = 100;
        int jahr = 1;
        double prozent = 3;

        while (jahr <= wieVielJahren) {
            kapital += kapital * prozent / 100;
            System.out.printf("Kapital nach %d Jahr(en): %.2f %n", jahr, kapital);
            jahr++;
        }
    }
}
