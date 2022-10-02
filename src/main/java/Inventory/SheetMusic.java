package Inventory;

public class SheetMusic extends InventoryItem{

    private String artist;

    private String album;

    public SheetMusic(double buyingPrice, double sellingPrice, String description, String artist, String album) {
        super(buyingPrice, sellingPrice, description);
        this.artist = artist;
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
