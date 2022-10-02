package Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifiersTest {

    Amplifier amplifier;

    @Before
    public void before() {
        amplifier = new Amplifier(50.00, 100.00, "Amp", 100, "Fender");
    }

    @Test
    public void ampHasMarkUp() {
        assertEquals(50.00, amplifier.calculateMarkup(), 0.0);
    }

    @Test
    public void ampHasBuyingPrice() {
        assertEquals(50.00, amplifier.getBuyingPrice(), 0.0);
    }

    @Test
    public void ampHasSellingPrice() {
        assertEquals(100.00, amplifier.getSellingPrice(), 0.0);
    }

    @Test
    public void ampHasDescription() {
        assertEquals("Amp", amplifier.getDescription());
    }

    @Test
    public void ampHasWattage() {
        assertEquals(100, amplifier.getWattage());
    }

    @Test
    public void ampHasMake() {
        assertEquals("Fender", amplifier.getMake());
    }
}
