package tag19.ha.a4;

public class Sorcerer extends Spellcaster {
    public Sorcerer() {
        ;
    }

    @Override
    public void castSpell() {
        super.castSpell();
        System.out.print("Meine Zauberkraft ist mir angeboren. ");
    }
}