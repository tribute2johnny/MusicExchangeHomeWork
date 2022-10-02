package Instruments;

import Instruments.Category.Category;

public class Harp extends Instrument{

    private int numStrings;
    private String typeOfHarp;

    public Harp(String material, String colour, Category category, String play, double buyingPrice, double sellingPrice, int numStrings, String typeOfHarp) {
        super(material, colour, category, play, buyingPrice, sellingPrice);
        this.numStrings = numStrings;
        this.typeOfHarp = typeOfHarp;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String getTypeOfHarp() {
        return typeOfHarp;
    }

    public void setTypeOfHarp(String typeOfHarp) {
        this.typeOfHarp = typeOfHarp;
    }


}
