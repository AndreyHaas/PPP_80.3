package markus;

public class Mensch {
    private String hautColor;
    private int gewicht;
    private int age;

    public Mensch(String hautColor, int gewicht, int age) {
        this.hautColor = hautColor;
        this.gewicht = gewicht;
        this.age = age;
    }

    public Mensch() {
    }

    public String getHautColor() {
        return hautColor;
    }

    public void setHautColor(String hautColor) {
        this.hautColor = hautColor;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
