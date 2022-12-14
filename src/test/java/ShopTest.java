import Instruments.Category.Category;
import Instruments.Guitar;
import Instruments.Piano;
import Inventory.GuitarStrings;
import Inventory.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Mahogany", "Sunburst", Category.STRING, "twang", 60.00, 120.00, 6, "Electric");
        piano = new Piano("Wood", "Maple", Category.KEYBOARD, "plink plink", 450.00, 1000.00, 88, "Classical");
        sheetMusic = new SheetMusic(4.00, 10.00, "Sheet Music", "Radiohead", "In Rainbows");
        guitarStrings = new GuitarStrings(4.00, 6.00, "guitar strings", "Steel");
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(sheetMusic);
        shop.addStock(guitarStrings);
    }



    @Test
    public void canAddStock() {
        shop.addStock(sheetMusic);
        assertEquals(5, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(sheetMusic);
        assertEquals(3, shop.getStockCount());
    }


    @Test
    public void canGetTotalStockCount() {
        assertEquals(4, shop.getTotalStockCount());
    }

}
