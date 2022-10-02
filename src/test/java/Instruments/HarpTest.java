package Instruments;

import Instruments.Category.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before() {
        harp = new Harp("Carbon Fibre", "Wood finish", Category.STRING, "ping ping", 350.00, 700.00, 22, "Pedal Harp");
    }

    @Test
    public void harpHasMaterial() {
        assertEquals("Carbon Fibre", harp.getMaterial());
    }

    @Test
    public void harpHasColour() {
        assertEquals("Wood finish", harp.getColour());
    }

    @Test
    public void harpHasCategory() {
        assertEquals(Category.STRING, harp.getCategory());
    }

    @Test
    public void harpHasNumStrings() {
        assertEquals(22, harp.getNumStrings());
    }

    @Test
    public void harpHasTypeOfHarp() {
        assertEquals("Pedal Harp", harp.getTypeOfHarp());
    }

    @Test
    public void harpCanPlay() {
        assertEquals("ping ping", harp.playSound());
    }

    @Test
    public void harpHasMarkUp() { assertEquals(350.00, harp.calculateMarkup(), 0.0);}



}
