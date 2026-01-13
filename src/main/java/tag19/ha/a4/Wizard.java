package tag19.ha.a4;

public class Wizard extends Spellcaster {
    public Wizard() {
        super.castSpell();
    }

    @Override
    public void castSpell() {
        System.out.print("Für meine Zauberkraft musste ich hart arbeiten. ");
    }
}