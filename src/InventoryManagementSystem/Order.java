package InventoryManagementSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private static int nextOrderID = 1;
    private int orderID;
    private LocalDateTime orderDate;
    private List<InventoryItem> items;
    private double totalAmount;

    public Order() {
        this.orderID = nextOrderID++;
        this.orderDate = LocalDateTime.now();
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void addItem(InventoryItem item, int quantity) { // Add item to order with specified quantity
        items.add(item);
        totalAmount += item.getPrice() * quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

