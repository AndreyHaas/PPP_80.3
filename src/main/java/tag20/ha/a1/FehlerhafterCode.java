package tag20.ha.a1;

public class FehlerhafterCode {

    // Code und Beispieldaten aus Winterprüfung 2017 GA1 FIAE
    // Aufgabe am besten gemeinsam lösen.
    // Fehlerhaft

    static int FreieSitze(int anzahlSitze) {

        for (int reihe = 0; reihe < 3; reihe++) {
            int anzahlFrei = 0;

            for (int sitz = 0; sitz < 10; sitz++) {
                if (reihe == sitz) { // es gab eine Voraussetzung/Korrigiert für compiler: kino[reihe][sitz].
                    anzahlFrei++;
                    if (anzahlFrei == anzahlSitze) {
                        int sitzNr = reihe * 100 + (sitz - anzahlSitze);
                        return sitzNr;
                    }
                }
            }
        }
        return 0;
    }

    static int richtigeFreieSitze(int anzahlSitze) {

        for (int reihe = 0; reihe < 3; reihe++) {
            int anzahlFrei = 0;

            for (int sitz = 0; sitz < 10; sitz++) {
                if (reihe == sitz) { // es gab eine Voraussetzung: kino[reihe][sitz]. Sitz frei ausrechnen.
                    anzahlFrei++;
                    if (anzahlFrei == anzahlSitze) {
                        int erstesSitz = sitz - anzahlSitze + 1;
                        int sitzNr = (reihe + 1) * 100 + (erstesSitz + 1);
                        return sitzNr;
                    }
                } else {// Sitz besetzt
                    anzahlFrei = 0;
                }
            }
        }
        return 0; // nichts gefunden
    }
}