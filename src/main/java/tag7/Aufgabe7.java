package tag7;

import org.jetbrains.annotations.NotNull;

public class Aufgabe7 {
    static class Bibliotheksverwaltung {

        public static void main(String[] args) {
            Buch[] buches = new Buch[5];
            buches[0] = new Buch("Faust", "Johann Wolfgang von Goethe");
            buches[1] = new Buch("Nathan der Weise", "Gotthold Ephraim Lessing");
            buches[2] = new Buch("Wilhelm Tell", "Friedrich Schiller");
            buches[3] = new Buch("Der Zauberberg", "Thomas Mann");
            buches[4] = new Buch("Der Steppenwolf", "Hermann Hesse");

            Buch instance = new Buch();

            for (Buch buch : buches){
                instance.zeigeDetails(buch);
            }
        }
    }

    static class Buch {
        String titel;
        String autor;

        public Buch() {
        }

        public Buch(String titel, String autor) {
            this.titel = titel;
            this.autor = autor;
        }

        public String getTitel() {
            return titel;
        }

        public String getAutor() {
            return autor;
        }

        void zeigeDetails(@NotNull Buch buch) {
            System.out.printf("Titel-%s,\t Autor-%s%n" , buch.getTitel(), buch.getAutor());
        }
    }
}
