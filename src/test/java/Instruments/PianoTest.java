package Instruments;

import Instruments.Category.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Wood", "Maple", Category.KEYBOARD, "plink plink", 450.00, 1000.00, 88, "Classical");
    }

    @Test
    public void pianoHasMaterial() {

        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void pianoHasColour() {

        assertEquals("Maple", piano.getColour());
    }

    @Test
    public void pianoHasCategory() {

        assertEquals(Category.KEYBOARD, piano.getCategory());
    }

    @Test
    public void pianoHasNumOfKeys() {

        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void pianoHasTypeOfPiano() {

        assertEquals("Classical", piano.getTypeOfPiano());
    }

    @Test
    public void pianoCanPlay() {
        assertEquals("plink plink", piano.playSound());}

    @Test
    public void pianoHasMarkUp() {
        assertEquals(550.00, piano.calculateMarkup(), 0.0);
    }
}
