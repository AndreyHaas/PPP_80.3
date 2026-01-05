package tag14;

/*
Erstelle zuerst einen Pseudocode und dann ein Java-Programm, das einen Getraenkeautomaten simuliert.
	Anforderungen:

	1) Klasse GetraenkeAutomat mit Methoden:
	 - zeigeMenue(): zeigt ein Menue mit Getraenken und Preisen.
	 - waehleGetraenk(int auswahl): verarbeitet die Auswahl mit switch-case und gibt den Preis aus.

	2) Main-Klasse:
	 - Erzeuge ein Objekt vom Typ GetraenkeAutomat.
	 - Zeige das Menü und lese die Auswahl.
	 - Es werden nur sinnvolle Eingaben fuer die Auswahl angenommen, d.h. die Auswahl wird wiederholt
	 - Erlaube mehrere Bestellungen (Schleife), bis der Benutzer 0 eingibt.
	 - Berechne die Gesamtsumme.

	Beispielausgabe (gekuerzt):

	Willkommen beim Getraenkeautomaten!

	Bitte waehlen Sie (0 zum Beenden):
	1 - Wasser (1.00 Euro)
	2 - Cola (1.50 Euro)
	3 - Kaffee (2.00 Euro)
	4 - Tee (1.80 Euro)

	Ihre Auswahl: 2

	Sie haben Cola gewaehlt. Preis: 1.50 Euro

	Zwischensumme: 1.50 Euro
	Gesamtsumme: 3.00 Euro

	-----------------------
START
    KLASSE GetraenkeAutomat erstellen
  METHODE zeigeMenue()
    AUSGEBE "Bitte wählen Sie:"
    AUSGEBE "1 - Wasser (1.00 Euro)"
    AUSGEBE "2 - Cola (1.50 Euro)"
    AUSGEBE "3 - Kaffee (2.00 Euro)"
    AUSGEBE "4 - Tee (1.80 Euro)"
    AUSGEBE "0 - Beenden"
  ENDE_METHODE

  METHODE waehleGetraenk(int auswahl): GIBT_ZURÜCK double
    SET preis = 0.0

    WÄHLE (auswahl) FALLS
      FALL 1:
        AUSGEBE "Sie haben Wasser gewählt. Preis: 1.00 Euro"
        SET preis = 1.00
        BRICH_AB

      FALL 2:
        AUSGEBE "Sie haben Cola gewählt. Preis: 1.50 Euro"
        SET preis = 1.50
        BRICH_AB

      FALL 3:
        AUSGEBE "Sie haben Kaffee gewählt. Preis: 2.00 Euro"
        SET preis = 2.00
        BRICH_AB

      FALL 4:
        AUSGEBE "Sie haben Tee gewählt. Preis: 1.80 Euro"
        SET preis = 1.80
        BRICH_AB

      SONST:
        AUSGEBE "Ungültige Auswahl!"
        SET preis = 0.0
    ENDE_WÄHLE

    GIB_ZURÜCK preis
  ENDE_METHODE
ENDE_KLASSE

// ================================================

KLASSE GetraenkeAutomatApp
  METHODE main()

    ERSTELLE automat = neues GetraenkeAutomat-Objekt
    ERSTELLE scanner = neues Scanner-Objekt für Eingabe

    SET gesamtSumme = 0.0
    SET zwischenSumme = 0.0
    SET userAuswahl = 0
    SET price = 0.0

    AUSGEBE "Willkommen beim Getränkeautomaten!"


    WIEDERHOLE
      automat.zeigeMenue()

      AUSGEBE "Ihre Auswahl (0 zum Beenden): "
      EINLESE userAuswahl als Ganzzahl von scanner

      WENN userAuswahl < 0 ODER userAuswahl > 4 DANN
        AUSGEBE "Ungültige Auswahl! Bitte von 0 bis 4 eingeben."
      SONST_WENN userAuswahl != 0 DANN
        SET price = automat.waehleGetraenk(userAuswahl)

        SET zwischenSumme = zwischenSumme + price

        AUSGEBE "Zwischensumme: " + zwischenSumme + " Euro"
      ENDE_WENN
    SOLANGE userAuswahl != 0 WIEDERHOLE

    SET gesamtSumme = gesamtSumme + zwischenSumme

    RUFE_AUF belegAusdruecken(gesamtSumme)
    scanner.schliessen()
  ENDE_METHODE

  METHODE belegAusdruecken(double gesamtSumme)
    SET begrenzer = "*******************************"

    AUSGEBE begrenzer
    AUSGEBE "Vielen Dank für Ihren Einkauf!"
    AUSGEBE "" // Leerzeile
    AUSGEBE "Gesamtsumme: " + gesamtSumme + " Euro" // Formatiert auf 2 Nachkommastellen
    AUSGEBE "" // Leerzeile
    AUSGEBE "Auf Wiedersehen!"
    AUSGEBE begrenzer
  ENDE_METHODE
ENDE_KLASSE
ENDE
 */
public class GetraenkeAutomat {

    static int wasser = 10;
    static int cola = 10;
    static int kaffee = 10;
    static int tee = 10;
    static int prosecco = 10;

    void zeigeMenue() {
        System.out.println("Bitte wählen Sie:");
        
        if (wasser > 0) {
            System.out.println("1 - Wasser (1.00 Euro). Verfuegbar: " + wasser);
        }
        
        if (cola > 0) {
            System.out.println("2 - Cola (1.50 Euro).  Verfuegbar: " + cola);
        }
        
        if (kaffee > 0) {
            System.out.println("3 - Kaffee (2.00 Euro). Verfuegbar: " + kaffee);
        }
        
        if (tee > 0) {
            System.out.println("4 - Tee (1.80 Euro). Verfuegbar: " + tee);
        }
        
        if (prosecco > 0) {
            System.out.println("5 - Prosecco (4.30 Euro). Verfuegbar: " + prosecco);
        }
        
        System.out.println("0 - Beenden");
    }

    double waehleGetraenk(int auswahl) {
        return
                switch (auswahl) {
                    case 1 -> {
                        System.out.println("Sie haben Wasser gewählt. Preis: 1.00 Euro");
                        wasser--;
                        yield 1.00;
                    }

                    case 2 -> {
                        System.out.println("Sie haben Cola gewählt. Preis: 1.50 Euro");
                        cola--;
                        yield 1.5;
                    }

                    case 3 -> {
                        System.out.println("Sie haben Kaffee gewählt. Preis: 2.00 Euro");
                        kaffee--;
                        yield 2.0;
                    }

                    case 4 -> {
                        System.out.println("Sie haben Tee gewählt. Preis: 1.80 Euro");
                        tee--;
                        yield 1.8;
                    }

                    case 5 -> {
                        System.out.println("Sie haben Prosecco gewählt. Preis: 4.30 Euro");
                        prosecco--;
                        yield 4.30;
                    }

                    default -> {
                        System.out.println("Ungültige Auswahl!");
                        yield 0.0;
                    }
                };
    }
}
