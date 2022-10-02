package Instruments;

import Instruments.Category.Category;

public class Piano extends Instrument{

    private int numOfKeys;
    private String typeOfPiano;

    public Piano(String material, String colour, Category category, String play, double buyingPrice, double sellingPrice, int numOfKeys, String typeOfPiano) {
        super(material, colour, category, play, buyingPrice, sellingPrice);
        this.numOfKeys = numOfKeys;
        this.typeOfPiano = typeOfPiano;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public String getTypeOfPiano() {
        return typeOfPiano;
    }

    public void setTypeOfPiano(String typeOfPiano) {
        this.typeOfPiano = typeOfPiano;
    }


}
