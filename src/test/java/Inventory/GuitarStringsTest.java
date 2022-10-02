package Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings(4.00, 6.00, "guitar strings", "Steel");
    }

    @Test
    public void guitarStringsHasBuyingPrice() {
        assertEquals(4.00, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void guitarStringsHasSellingPrice() {
        assertEquals(6.00, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void guitarStringsMarkUp() {
        assertEquals(2.00, guitarStrings.calculateMarkup(), 0.0);
    }

    @Test
    public void guitarStringsHasDescription() {
        assertEquals("guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void guitarStringsHasMaterial() {
        assertEquals("Steel", guitarStrings.getMaterial());
    }
}
