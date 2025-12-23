package tag11;

public class Robot {
    private int batterieLaufzeit;
    private String aufgabe;

    public int getBatterieLaufzeit() {
        return batterieLaufzeit;
    }

    public void setBatterieLaufzeit(int batterieLaufzeit) {
        this.batterieLaufzeit = batterieLaufzeit;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Robot that)) return false;

        return batterieLaufzeit == that.batterieLaufzeit && aufgabe.equals(that.aufgabe);
    }

    @Override
    public int hashCode() {
        int result = batterieLaufzeit;
        result = 31 * result + aufgabe.hashCode();
        return result;
    }

    public boolean istBatterieLaufzeitNiedrig() {
        return batterieLaufzeit < 2;
    }

    public void fuehreAufgabeAus() {
        if (!istBatterieLaufzeitNiedrig()) {
            System.out.println(getAufgabe());
            batterieLaufzeit--;
        } else
            System.out.println("Ich muss aufgeladen werden.");
    }
}
