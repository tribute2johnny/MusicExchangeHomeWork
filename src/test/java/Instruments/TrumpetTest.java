package Instruments;

import Instruments.Category.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Brass", "Black", Category.WIND_BRASS, "Doo Doo", 300, 700, 4, "Piccolo");
    }

    @Test
    public void trumpetHasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void trumpetHasColour() {
        assertEquals("Black", trumpet.getColour());
    }

    @Test
    public void trumpetHasCategory() {
        assertEquals(Category.WIND_BRASS, trumpet.getCategory());
    }

    @Test
    public void trumpetHasNumOfValves() {
        assertEquals(4, trumpet.getNumOfValves());
    }

    @Test
    public void trumpetHasTypeOfTrumpet() {
        assertEquals("Piccolo", trumpet.getTypeOfTrumpet());
    }

    @Test
    public void trumpetCanPlay() {
        assertEquals("Doo Doo", trumpet.playSound());
    }

    @Test
    public void trumpetHasMarkUp() { assertEquals(400.00, trumpet.calculateMarkup(), 0.0);}
}
