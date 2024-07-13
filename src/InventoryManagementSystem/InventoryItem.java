package InventoryManagementSystem;

public class InventoryItem extends AbstractItem {
    private int itemID;
    private int quantity;

    // Constructor
    public InventoryItem(String name, int itemID, String category, int quantity, boolean breakable, boolean perishable, double price) {
        super(name, category, breakable, perishable, price);
        this.itemID = itemID;
        this.quantity = quantity;
    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculateValue() {
        return price * quantity;
    }
}
