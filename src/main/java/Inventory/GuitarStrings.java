package Inventory;

public class GuitarStrings extends InventoryItem{

    private String material;

    public GuitarStrings(double buyingPrice, double sellingPrice, String description, String material) {
        super(buyingPrice, sellingPrice, description);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
