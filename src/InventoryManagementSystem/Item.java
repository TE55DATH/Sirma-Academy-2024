package InventoryManagementSystem;

// Item.java
public interface Item {
    String getItemDetails();    //This method will get the details of the item
    double calculateValue();    //This method will calculate the value of the item
    void displayDescription();  //This method will display the item's description
}
