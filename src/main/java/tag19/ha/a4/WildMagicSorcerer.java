package tag19.ha.a4;

public class WildMagicSorcerer extends Sorcerer {
    public WildMagicSorcerer() {

    }

    @Override
    public void castSpell() {
        super.castSpell();
        System.out.print("Meine Zauber sind unberechenbar.\n");
    }
}