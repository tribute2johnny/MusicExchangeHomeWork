import Behaviours.ISell;
import Instruments.Instrument;
import Inventory.InventoryItem;


import java.util.ArrayList;

public class Shop {


    private ArrayList<InventoryItem> inventoryItems;

    private ArrayList<Instrument> instruments;


    public Shop() {
        this.inventoryItems = new ArrayList<InventoryItem>();
        this.instruments = new ArrayList<Instrument>();

    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public int getInstrumentCount() {
        return this.instruments.size();
    }

    public int getInventoryItemCount() {
        return this.inventoryItems.size();
    }

    public void addInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItems.add(inventoryItem);
    }

    public void addInstruments(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public void removeInstrument(Instrument instrument) {
        this.instruments.remove(instrument);
    }

    public void removeInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItems.remove(inventoryItem);
    }

    public ArrayList<ISell> getStock() {
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.addAll(this.inventoryItems);
        stock.addAll(this.instruments);
        return stock;
    }

    public int getTotalStockCount() {
        return this.getStock().size();
    }
//
//    public double calculateProfit() {
//        sum = 0;
//        int total;
//        ArrayList<ISell> stock = new ArrayList<ISell>();
//        stock.addAll(this.inventoryItems);
//        stock.addAll(this.instruments);
//        for (total = 0 ; total < stock.size(); total ++);
//    }
}
