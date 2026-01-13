package tag19.ha.a4;

public class Sorcerer extends Spellcaster {
    public Sorcerer() {
        super.castSpell();
    }

    @Override
    public void castSpell() {
        System.out.print("Meine Zauberkraft ist mir angeboren. ");
    }
}