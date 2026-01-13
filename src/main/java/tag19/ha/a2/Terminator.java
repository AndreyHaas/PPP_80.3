package tag19.ha.a2;

public class Terminator extends Robot {

    private String targetName;

    public String getTargetName() {
        return targetName;
    }

    public Terminator(String name, boolean isHostile, String targetName) {
        super(name, isHostile);
        this.targetName = targetName;
    }
}
