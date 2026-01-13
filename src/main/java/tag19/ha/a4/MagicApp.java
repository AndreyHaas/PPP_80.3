package tag19.ha.a4;

/* Level 1
    Erstellen Sie bitte die Klassen Spellcaster, Sorcerer, Wizard, WildMagicSorcerer und IllusionWizard:
        Sorcerer und Wizard sind Spellcaster.
        WildMagicSorcerer ist ein Sorcerer und IllusionWizard ist ein Wizard.
    Alle Spellcaster verfügen über die Methode "castSpell()"
        In Spellcaster gibt die Methode "Ich kann zaubern." aus.
    Sorcerer und Wizard überschreiben diese Methode.
        Sorcerer gibt "Ich kann zaubern." und "Meine Zauberkraft ist mir angeboren." aus.
        Wizard gibt "Ich kann zaubern." und "Für meine Zauberkraft musste ich hart arbeiten." aus.
    WildMagicSorcerer und IllusionWizard überschreiben und versiegeln(finalize) die Methode.
        WildMagicSorcerer gibt "Ich kann zaubern.", "Meine Zauberkraft ist mir angeboren." und "Meine Zauber sind unberechenbar." aus.
        IllusionWizard gibt "Ich kann zaubern.", "Für meine Zauberkraft musste ich hart arbeiten." und "Ich habe mich auf Illusionszauber spezialisiert." aus.

    Vermeiden Sie beim Überschreiben der Methode doppelten Code!

    In der Main erzeugen Sie einen wildMagicSorcerer und einen illusionWizard und rufen für beide die castSpell()-Methode auf.

    Erstellen Sie dazu ein Klassendiagramm
*/
public class MagicApp {
    public static void main(String[] args) {
        System.out.print("WildMagicSorcerer: ");
        WildMagicSorcerer wildMagicSorcerer = new WildMagicSorcerer();
        wildMagicSorcerer.castSpell();

        System.out.print("IllusionWizard: ");
        IllusionWizard illusionWizard = new IllusionWizard();
        illusionWizard.castSpell();
    }
}