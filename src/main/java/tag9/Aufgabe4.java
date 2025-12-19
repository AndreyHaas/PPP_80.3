package tag9;

/*
Aufgabe 4:
==========
Auf einem Bauernhof leben 5 Ziegen, 3 Kühe und 10 Hühner
eine Ziege verbraucht 5 Ziegenfutter pro Tag.
Eine Kuh verbraucht 10 Kuhfutter pro Tag.
Ein Huhn verbraucht 2 Hühnerfutter pro Tag.

Zum Programmstart gibt es von jedem Futter 100 Einheiten.

Wir brauchen 3 Methoden:
einTagVerstreicht()
kontrolliereVorrat()
fuelleVorratAuf()

In einer Schleife, die 50-mal läuft, werden folgende Methoden aufgerufen.
einTagVerstreicht() --> Die Tiere verbrauchen Futter
kontrolliereVorrat() --> Der Futterbestand wird geprüft
Sollte der Vorrat für ein Tier auf 0 oder kleiner 0 sinken, ruft kontrolliereVorrat()
die Methode fuelleVorratAuf() und übergibt ihr, welches Futter aufgefüllt werden muss.

Auf dem Bildschirm wird ausgegeben, wie sich der Futtervorrat über Zeit verändert und ggf.
wieder aufgefüllt wird.
Seid bei der Ausgabe so detailliert, wie möglich.
 */
public class Aufgabe4 {
    private static int ziegenFutter = 100;
    private static int kuhFutter = 100;
    private static int huehnerFutter = 100;

    private static final int ANZAHL_ZIEGEN = 5;
    private static final int ANZAHL_KUEHE = 3;
    private static final int ANZAHL_HUEHNER = 10;

    private static final int VERBRAUCH_ZIEGE = 5;
    private static final int VERBRAUCH_KUH = 10;
    private static final int VERBRAUCH_HUHN = 2;

    private static final int AUFFUELLUNG = 50;
    private static final int DAUER = 50;

    public static void main(String[] args) {

        for (int i = 1; i <= DAUER; i++) {
            einTagVerstreicht(i);
        }
        System.out.printf("Auf Lager geblieben: ziegenFutter = %d, kuhFutter = %d, hühnerFutter = %d%n",
                ziegenFutter, kuhFutter, huehnerFutter);
    }

    private static void kontrolliereVorrat() {
        if (ziegenFutter <= ANZAHL_ZIEGEN * VERBRAUCH_ZIEGE) {
            System.out.print("Ziegenfutter leer! ");
            fuelleVorratAuf("Ziege");
        }

        if (kuhFutter <= ANZAHL_KUEHE * VERBRAUCH_KUH) {
            System.out.print("Kuhfutter leer! ");
            fuelleVorratAuf("Kuh");
        }

        if (huehnerFutter <= ANZAHL_HUEHNER * VERBRAUCH_HUHN) {
            System.out.print("Hühnerfutter leer! ");
            fuelleVorratAuf("Hühne");
        }
    }

    private static void fuelleVorratAuf(String tier) {
        String string = "Aufgefüllt auf ";
        if (tier.equals("Ziege")) {
            ziegenFutter += AUFFUELLUNG;
            System.out.println(string + ziegenFutter);
        } else if (tier.equals("Kuh")) {
            kuhFutter += AUFFUELLUNG;
            System.out.println(string + kuhFutter);
        } else {
            huehnerFutter += AUFFUELLUNG;
            System.out.println(string + huehnerFutter);
        }
    }

    private static void einTagVerstreicht(int tag) {
        System.out.println("Tag: " + tag);
        ziegenFutter -= ANZAHL_ZIEGEN * VERBRAUCH_ZIEGE;
        kuhFutter -= ANZAHL_KUEHE * VERBRAUCH_KUH;
        huehnerFutter -= ANZAHL_HUEHNER * VERBRAUCH_HUHN;
        kontrolliereVorrat();
    }
}