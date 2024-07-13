package InventoryManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryFileIO {
    private static final String FILENAME = "inventory.txt";

    // Method to save inventory data to a text file
    public static void saveInventory(List<InventoryItem> inventory) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (InventoryItem item : inventory) {
                writer.println(item.getItemID() + "," +
                        item.getName() + "," +
                        item.getCategory() + "," +
                        item.getQuantity() + "," +
                        item.getPrice() + "," +
                        item.isBreakable() + "," +
                        item.isPerishable());
            }
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving inventory: " + e.getMessage());
        }
    }

    // Method to load inventory data from a text file
    public static List<InventoryItem> loadInventory() {
        List<InventoryItem> inventory = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int itemID = Integer.parseInt(parts[0]);
                String name = parts[1];
                String category = parts[2];
                int quantity = Integer.parseInt(parts[3]);
                double price = Double.parseDouble(parts[4]);
                boolean breakable = Boolean.parseBoolean(parts[5]);
                boolean perishable = Boolean.parseBoolean(parts[6]);

                // Create inventory item based on data read
                InventoryItem item = new InventoryItem(name, itemID, category, quantity, breakable, perishable, price);
                inventory.add(item);
            }
            System.out.println("Inventory loaded successfully.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading inventory: " + e.getMessage());
        }
        return inventory;
    }
}

