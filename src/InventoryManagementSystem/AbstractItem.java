package InventoryManagementSystem;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    protected String name;
    protected String category;
    protected boolean breakable;
    protected boolean perishable;
    protected double price;

    //Constructor
    public AbstractItem(String name, String category, boolean breakable, boolean perishable, double price) {
        this.name = name;
        this.category = category;
        this.breakable = breakable;
        this.perishable = perishable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getItemDetails(){   //This method will get the details of the item
        return "Name: " + name + ", Category: " + ", Price: " + price;
    }

    @Override
    public double calculateValue() { //This method will calculate the value of the item
        // To be used in InventoryItem super class
        return 0;
    }

    @Override
    public void displayDescription(){ //This method will display the item's description
        System.out.println(getItemDetails());
    }

    @Override
    public void setCategory(String category) { //This method will set the category of the item.
        this.category = category;
    }

    @Override
    public String getCategory() { // This method will return the category of the item.
        return category;
    }

    @Override
    public boolean isBreakable() { // This method will return true/false whether the item is breakable
        return breakable;
    }

    @Override
    public void handleBreakage() { // This method will break the item
        if (breakable) {
            System.out.println(name + " has broken.");
        }
    }

    @Override
    public boolean isPerishable() { // This method will return true/false whether the item is perishable
        return perishable;
    }

    @Override
    public void handleExpiration() { // This method will expire items
        if (perishable) {
            System.out.println(name + " has expired.");
        }
    }

    @Override
    public double getPrice() {   // This method will set the price of the item

        return price;
    }
    @Override
    public void setPrice(double price) {     // This method will return the price of the item

        this.price = price;
    }
}
