package Inventory;

public class Amplifier extends InventoryItem{

    private int wattage;

    private String make;

    public Amplifier(double buyingPrice, double sellingPrice, String description, int wattage, String make) {
        super(buyingPrice, sellingPrice, description);
        this.wattage = wattage;
        this.make = make;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
