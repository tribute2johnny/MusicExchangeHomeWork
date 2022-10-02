import Behaviours.ISell;


import java.util.ArrayList;

public class Shop {


    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addStock(ISell stock) {
        this.stock.add(stock);
    }


    public void removeStock(ISell stock) {
        this.stock.remove(stock);
    }


    public ArrayList<ISell> getStock() {
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.addAll(this.stock);
        return stock;
    }

    public int getTotalStockCount() {

        return this.getStock().size();
    }

}
