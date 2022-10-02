package Instruments;

import Behaviours.IPlay;
import Instruments.Category.Category;

public class Guitar extends Instrument {

    private int numStrings;

    private String typeOfGuitar;

    public Guitar(String material, String colour, Category category, String play, double buyingPrice, double sellingPrice, int numStrings, String typeOfGuitar) {
        super(material, colour, category, play, buyingPrice, sellingPrice);
        this.numStrings = numStrings;
        this.typeOfGuitar = typeOfGuitar;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public void setTypeOfGuitar(String typeOfGuitar) {
        this.typeOfGuitar = typeOfGuitar;
    }


}
