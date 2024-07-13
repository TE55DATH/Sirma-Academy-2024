package InventoryManagementSystem;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {
    private LocalDate expirationDate; //Additional attribute for grocery items

    // Constructor with expirationDate parameter
    public GroceryItem(int itemID, String name, int quantity, double price, LocalDate expirationDate) {
        super(name, itemID, "Grocery", quantity, false, true, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateValue() {    // Grocery items have different calculation for value, e.g., price * quantity
        return getPrice() * getQuantity();
    }

    @Override
    public void displayDescription() {  // Override to include expiration date in description
        System.out.println(getItemDetails() + ", Expiration Date: " + expirationDate);
    }

    @Override
    public void handleExpiration() { //Handling expiration for grocery item
        System.out.println("The item: " + name + " has expired.");
    }
}
