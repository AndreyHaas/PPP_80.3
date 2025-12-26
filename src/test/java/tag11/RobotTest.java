package tag11;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    private Robot robot;

    @Before
    public void setUp() {
        robot = new Robot();
        robot.setAufgabe("Aufgabe");
        robot.setBatterieLaufzeit(3);
    }

    @Test
    public void fuehreAufgabeAusBattUeberZwo() {
        robot.fuehreAufgabeAus();

        String expected = "Aufgabe";
        assertEquals(expected, robot.getAufgabe());
    }

    @Test
    public void fuehreAufgabeAusBattEins() {
        robot.setBatterieLaufzeit(1);
        robot.fuehreAufgabeAus();

        String expected = "Ich muss aufgeladen werden.";
        assertEquals(expected, robot.fuehreAufgabeAus());
    }

    @Test
    public void getLaufZeit() {
        robot.setBatterieLaufzeit(15);

        assertEquals(15, robot.getBatterieLaufzeit());
    }
}