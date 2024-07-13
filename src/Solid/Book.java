package Solid;

public class Book {
    private String title;
    private String author;
    // ... other properties
    public void saveToDatabase() {
// Save book to the database
    }
    public String getBookSummary() {
        return title + " by " + author;
    }
}