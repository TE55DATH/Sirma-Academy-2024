package InventoryManagementSystem;

public interface Breakable {
    boolean isBreakable(); // This method will return true/false whether the item is breakable
    void handleBreakage(); // This method will break the item
}
