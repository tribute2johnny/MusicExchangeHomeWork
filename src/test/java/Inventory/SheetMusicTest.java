package Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(4.00, 10.00, "Sheet Music", "Radiohead", "In Rainbows");
    }

    @Test
    public void sheetMusicHasBuyingPrice() {
        assertEquals(4.00, sheetMusic.getBuyingPrice(), 0.0);
    }

    @Test
    public void sheetMusicHasSeelingPrice() {
        assertEquals(10.00, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void sheetMusicHasDescription() {
        assertEquals("Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void sheetMusicHasArtist() {
        assertEquals("Radiohead", sheetMusic.getArtist());
    }

    @Test
    public void sheetMusicHasAlbum() {
        assertEquals("In Rainbows", sheetMusic.getAlbum());
    }

    @Test
    public void sheetMusicHasMarkUp() {
        assertEquals(6.00, sheetMusic.calculateMarkup(), 0.0);
    }
}
