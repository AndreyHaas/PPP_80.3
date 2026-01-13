package tag19.ha.a4;

public class IllusionWizard extends Wizard {
    public IllusionWizard() {
        super.castSpell();
    }

    @Override
    public void castSpell() {
        System.out.print("Ich habe mich auf Illusionszauber spezialisiert.\n");
    }
}