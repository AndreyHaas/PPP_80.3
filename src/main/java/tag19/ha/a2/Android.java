package tag19.ha.a2;

public class Android extends Robot {

    private final boolean isHuman;

    public boolean isHuman() {
        return isHuman;
    }

    public Android(String name, boolean isHostile, boolean isHuman) {
        super(name, isHostile);
        this.isHuman = isHuman;
    }
}