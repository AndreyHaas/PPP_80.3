package tag02;

public class App {
    public static void main(String[] args) {
        Mensch markus = new Mensch();
        markus.setHautColor("Weiß");
        markus.setGewicht(83);

        Mensch erna = new Mensch("Schwarz", 70, 38);

        System.out.println("Markus wicht " + markus.getGewicht() + " haut color " + markus.getHautColor());
        System.out.println("Erna wicht " + erna.getGewicht() + " haut color " + erna.getHautColor());
    }
}
