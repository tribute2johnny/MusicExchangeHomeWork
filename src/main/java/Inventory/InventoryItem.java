package Inventory;

import Behaviours.ISell;

public abstract class InventoryItem implements ISell {

    private double buyingPrice;

    private double sellingPrice;

    private String Description;

    public InventoryItem(double buyingPrice, double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        Description = description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double calculateMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }
}


