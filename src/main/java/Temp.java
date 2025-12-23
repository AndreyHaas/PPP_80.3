import tag11.Robot;
import tag11.Song;

public class Temp {
    public static void main(String[] args) {
        Song song = new Song();
        song.setTitel("O Tannenbaum");
        song.setDauerSekunden(189);
        song.setInterpret("Ernst Anschuetz");

        song.spielen();

        /*---------------------------------------------------*/

        Robot robot = new Robot();
        robot.setBatterieLaufzeit(5);
        robot.setAufgabe("Ich reiche Butter");

        for (int i = 0; i < 5; i++) {
            robot.fuehreAufgabeAus();
        }
    }
}
