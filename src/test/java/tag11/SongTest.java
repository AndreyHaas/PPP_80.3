package tag11;

import junit.framework.TestCase;

public class SongTest extends TestCase {

    private Song song;

    @Override
    public void setUp() {
        song = new Song();
        song.setTitle("O Tannenbaum");
        song.setInterpret("Ernst Anschuetz");
        song.setDauerSek(189);
    }

    public void testSpielenTest() {
        String expected = "Song: O Tannenbaum, Interpret: Ernst Anschuetz, Dauer: 03:09";
        assertEquals(expected, song.spielen());
    }
}