package InventoryManagementSystem;

public interface PaymentMethod {
    boolean validate();
    boolean authorize(double amount);
}
