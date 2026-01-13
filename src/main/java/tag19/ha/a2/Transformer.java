package tag19.ha.a2;

public class Transformer extends Robot {

    private final String faction;

    public String getFaction() {
        return faction;
    }

    public Transformer(String name, boolean isHostile, String faction) {
        super(name, isHostile);
        this.faction = faction;
    }
}