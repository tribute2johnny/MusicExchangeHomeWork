package Instruments;

import Instruments.Category.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Mahogany", "Sunburst", Category.STRING, "twang", 60.00, 120.00, 6, "Electric");
    }

    @Test
    public void guitarHasMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void guitarHasColour() {
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void guitarHasCategory() {
        assertEquals(Category.STRING, guitar.getCategory());
    }

    @Test
    public void guitarHasNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void guitarHasTypeOfGuitar() {
        assertEquals("Electric", guitar.getTypeOfGuitar());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("twang", guitar.playSound());
    }

    @Test
    public void guitarHasMarkUp() { assertEquals(60.00, guitar.calculateMarkup(), 0.0);}

}
