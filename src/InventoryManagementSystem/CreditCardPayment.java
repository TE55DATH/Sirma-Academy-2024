package InventoryManagementSystem;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String CVV;

    public CreditCardPayment(String cardNumber, String expiryDate, String CVV) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    @Override
    public boolean validate() {
        return cardNumber != null && cardNumber.length() == 16 && expiryDate != null && CVV != null && CVV.length() == 3;
    }

    @Override
    public boolean authorize(double amount) {   // Simulate payment authorization
        System.out.println("Authorizing credit card payment of $" + amount);
        return true;
    }
}
