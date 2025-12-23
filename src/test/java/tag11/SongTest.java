package tag11;

import junit.framework.TestCase;
import org.junit.Test;

public class SongTest extends TestCase {

    Song song;

    @Override
    public void setUp() {
        song = new Song();
        song.setTitle("Title");
        song.setInterpret("Interpret");
        song.setDauerSek(61);
    }

    @Test
    public void testSpielen() {
        String info = song.spielen();
        String expected = "Song: Title, Interpret: Interpret, dauer: 01:01";
        assertEquals(expected, info);
    }
}