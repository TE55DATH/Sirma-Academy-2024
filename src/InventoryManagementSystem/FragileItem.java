package InventoryManagementSystem;

public class FragileItem extends InventoryItem {
    private double weight; // Additional attribute for fragile items

    // Constructor with weight parameter
    public FragileItem(int itemID, String name, int quantity, double price, double weight) {
        super(name, itemID, "Fragile", quantity, true, false, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateValue() {    // Fragile items have different calculation for value, e.g., price * quantity * weight
        return getPrice() * getQuantity() * weight;
    }

    @Override
    public void displayDescription() {  // Override to include weight in description
        System.out.println(getItemDetails() + ", Weight: " + weight + " kg");
    }

    @Override
    public void handleBreakage() { // Handling breakage for fragile item
        if(isBreakable()) {
            System.out.println("The item " + name + " has been broken.");
        }
    }
}
