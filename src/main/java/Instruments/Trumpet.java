package Instruments;

import Instruments.Category.Category;

public class Trumpet extends Instrument{

    private int numOfValves;
    private String typeOfTrumpet;

    public Trumpet(String material, String colour, Category category, String play, double buyingPrice, double sellingPrice, int numOfValves, String typeOfTrumpet) {
        super(material, colour, category, play, buyingPrice, sellingPrice);
        this.numOfValves = numOfValves;
        this.typeOfTrumpet = typeOfTrumpet;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public void setNumOfValves(int numOfValves) {
        this.numOfValves = numOfValves;
    }

    public String getTypeOfTrumpet() {
        return typeOfTrumpet;
    }

    public void setTypeOfTrumpet(String typeOfTrumpet) {
        this.typeOfTrumpet = typeOfTrumpet;
    }
}
