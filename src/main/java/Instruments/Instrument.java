package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Instruments.Category.Category;
import Inventory.InventoryItem;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private Category category;
    private String play;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String material, String colour, Category category, String play, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.category = category;
        this.play = play;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String playSound() {
        return this.play;
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

    public double calculateMarkup() {
        return (this.sellingPrice - this.buyingPrice);
    }
}
