package tag19.ha.a2;

public class RobotApp {
    public static void main(String[] args) {
        System.out.println("======== Terminator ========");
        Terminator terminator = new Terminator("Hostile", false, "Human");
        System.out.println("Terminator's name: " + terminator.getName());
        System.out.println("Terminator ist hostile: " + terminator.isHostile());
        System.out.println("Terminator's target Name: " + terminator.getTargetName());
        System.out.println("======== Transformer ========");
        Transformer transformer = new Transformer("Trans", true, "Autobots");
        System.out.println("Transformer's Name: " + transformer.getName());
        System.out.println("Transformer ist hostile: " + transformer.isHostile());
        System.out.println("Transformer's Faction: " + transformer.getFaction());
        System.out.println("======== Android ========");
        Android android = new Android("Huawei", true, false);
        System.out.println("Android's Name: " + android.getName());
        System.out.println("Android ist hostile: " + android.isHostile());
        System.out.println("Android ist Human: " + android.isHuman());
    }
}