package tag19;

public class Vererbung {
    public static void main(String[] args) {
        Pkw pkw = new Pkw("Mercedes-Benz", "IN A 1", 5);
        pkw.starten();
        pkw.wartungDurchfuehren();
        System.out.println("PKW = " + pkw);

        Lkw lkw = new Lkw("MAN", "IN A 2", 10_000);
        lkw.starten();
        System.out.println("LKW = " + lkw);
        lkw.wartungDurchfuehren();

        Wartbar pkw1 = new Pkw("Audi", "IN A 3", 3);
        System.out.println("PKW1 = " + pkw1);
        pkw1.wartungDurchfuehren();

        Wartbar[] fahrzeuge = new Wartbar[2];
        fahrzeuge[0] = pkw;
        fahrzeuge[1] = lkw;

        for (Wartbar fahrzeug: fahrzeuge) {
            Werkstatt.watrungDrurchfuehren(fahrzeug);
        }
    }
}
