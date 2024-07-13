package InventoryManagementSystem;

public class ElectronicsItem extends InventoryItem {
    private double weight; // Additional attribute for electronics items

    // Constructor with weight parameter
    public ElectronicsItem(String name, int itemID, int quantity, double price, double weight) {
        super(name, itemID, "Electronics", quantity, true, false, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateValue() {    // Electronics items have different calculation for value, e.g., but for now: price * quantity * weight
        return getPrice() * getQuantity() * weight;
    }

    @Override
    public void handleBreakage() { // Handling breakage for electronics item
        System.out.println("The item " + name + " has been broken.");
    }
}