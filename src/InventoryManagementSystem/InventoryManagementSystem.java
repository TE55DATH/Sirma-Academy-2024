package InventoryManagementSystem;

import java.util.List;
import java.util.Scanner;

public class InventoryManagementSystem {
    private static List<InventoryItem> inventory;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Load inventory from file
        inventory = InventoryFileIO.loadInventory();

        // Display menu
        while (true) {
            System.out.println("\n==== Inventory Management System Menu ====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item by ID");
            System.out.println("3. Display Inventory");
            System.out.println("4. Categorize Items");
            System.out.println("5. Place Order");
            System.out.println("6. Save and Exit");

            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> displayInventory();
                case 4 -> categorizeItems();
                case 5 -> placeOrder();
                case 6 -> {
                    saveAndExit();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    // Method to add a new item to the inventory
    private static void addItem() {
        try {
            System.out.println("\n=== Add New Item ===");
            System.out.print("Enter Item ID: ");
            int itemID = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Item Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Item Category: ");
            String category = scanner.nextLine();
            System.out.print("Enter Item Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Item Price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Is the item breakable? (true/false): ");
            boolean breakable = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Is the item perishable? (true/false): ");
            boolean perishable = Boolean.parseBoolean(scanner.nextLine());

            // Create new InventoryItem object and add to inventory list
            InventoryItem newItem = new InventoryItem(name, itemID, category, quantity, breakable, perishable, price);
            inventory.add(newItem);
            System.out.println("Item added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }

    // Method to remove an item from the inventory by ID
    private static void removeItem() {
        try {
            System.out.println("\n=== Remove Item ===");
            System.out.print("Enter Item ID to remove: ");
            int itemID = Integer.parseInt(scanner.nextLine());
            boolean removed = inventory.removeIf(item -> item.getItemID() == itemID);
            if (removed) {
                System.out.println("Item removed successfully.");
            } else {
                System.out.println("Item with ID " + itemID + " not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid item ID.");
        }
    }

    // Method to display all items in the inventory
    private static void displayInventory() {
        System.out.println("\n=== Inventory Items ===");
        for (InventoryItem item : inventory) {
            System.out.println(item.getItemDetails());
        }
    }

    // Method to categorize items by category
    private static void categorizeItems() {
        System.out.println("\n=== Categorize Items ===");
        System.out.print("Enter category to display items: ");
        String category = scanner.nextLine();
        System.out.println("Items in category '" + category + "':");
        for (InventoryItem item : inventory) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    // Method to place an order
    private static void placeOrder() {
        try {
            System.out.println("\n=== Place Order ===");
            Order order = new Order();
            while (true) {
                System.out.print("Enter Item ID to add to order (or 0 to finish): ");
                int itemID = Integer.parseInt(scanner.nextLine());
                if (itemID == 0) {
                    break;
                }
                InventoryItem item = inventory.stream()
                        .filter(i -> i.getItemID() == itemID)
                        .findFirst()
                        .orElse(null);
                if (item == null) {
                    System.out.println("Item with ID " + itemID + " not found.");
                    continue;
                }
                System.out.print("Enter quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                if (quantity > item.getQuantity()) {
                    System.out.println("Not enough stock. Available quantity: " + item.getQuantity());
                    continue;
                }
                order.addItem(item, quantity);
                item.setQuantity(item.getQuantity() - quantity);
            }

            // Calculate total and process payment
            double totalAmount = order.getTotalAmount();
            System.out.println("Total order amount: $" + totalAmount);
            System.out.print("Enter payment amount: ");
            double paymentAmount = Double.parseDouble(scanner.nextLine());
            if (paymentAmount < totalAmount) {
                System.out.println("Insufficient payment. Order not processed.");
            } else {
                Payment payment = new Payment(paymentAmount);
                System.out.println("Payment of $" + payment.getAmountPaid() + " received. Order processed.");
                if (paymentAmount > totalAmount) {
                    System.out.println("Change to be returned: $" + (paymentAmount - totalAmount));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }

    // Method to save inventory to file and exit the program
    private static void saveAndExit() {
        InventoryFileIO.saveInventory(inventory);
        System.out.println("Exiting Inventory Management System. Goodbye!");
    }
}

