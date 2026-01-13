package tag19.ha.a2;

/* Level 1
  Basisklasse Robot
   - Attribute: name, isHostile
  Subklasse Terminator, erbt von Robot
   - Attribute: targetName
  Subklasse Transformer, erbt von Robot
   - Attribute: faction
  Subklasse Android, erbt von Robot
   - Attribute: isHuman

  Erstellen Sie von jeder Klasse ein Objekt und weisen sie den Attributen über die Konstruktoren beliebige Werte zu.
  Testen Sie die Attribute durch Konsolenausgaben
 */
public class Robot {
    private final String name;
    private final boolean isHostile;

    public String getName() {
        return name;
    }

    public boolean isHostile() {
        return isHostile;
    }

    public Robot(String name, boolean isHostile) {
        this.name = name;
        this.isHostile = isHostile;
    }
}