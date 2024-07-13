package InventoryManagementSystem;

public interface Perishable {
    boolean isPerishable();   // This method will return true/false whether the item is perishable
    void handleExpiration();  // This method will expire items
}
