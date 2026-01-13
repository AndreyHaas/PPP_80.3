package tag19.ha.a4;

public class WildMagicSorcerer extends Sorcerer {
    public WildMagicSorcerer() {
        super.castSpell();
    }

    @Override
    public void castSpell() {
        System.out.print("Meine Zauber sind unberechenbar.\n");
    }
}