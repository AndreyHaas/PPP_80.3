package tag19.ha.a4;

public class IllusionWizard extends Wizard {
    public IllusionWizard() {

    }

    @Override
    public void castSpell() {
        super.castSpell();
        System.out.print("Ich habe mich auf Illusionszauber spezialisiert.\n");
    }
}