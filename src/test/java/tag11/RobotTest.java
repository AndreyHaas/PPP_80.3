package tag11;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {
    Robot robot;

    @Before
    public void setUp() {
        robot = new Robot();
        robot.setAufgabe("Aufgabe");
        robot.setBatterieLaufzeit(3);
    }

    @Test
    public void fuehreAufgabeAusBattUeberZwo() {
        robot.fuehreAufgabeAus();

        assertEquals("Aufgabe", robot.getAufgabe());
    }

    @Test
    public void fuehreAufgabeAusBattEins() {
        robot = new Robot();
        robot.setBatterieLaufzeit(1);
        robot.fuehreAufgabeAus();

        assertEquals("Ich muss aufgeladen werden.", robot.fuehreAufgabeAus());
    }

    @Test
    public void getLaufZeit() {
        robot = new Robot();
        robot.setBatterieLaufzeit(15);

        assertEquals(15, robot.getBatterieLaufzeit());
    }
}