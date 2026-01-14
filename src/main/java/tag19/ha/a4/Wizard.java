package tag19.ha.a4;

public class Wizard extends Spellcaster {
    public Wizard() {

    }

    @Override
    public void castSpell() {
        super.castSpell();
        System.out.print("Für meine Zauberkraft musste ich hart arbeiten. ");
    }
}