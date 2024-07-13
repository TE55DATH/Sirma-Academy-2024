package InventoryManagementSystem;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validate() {
        return email != null && email.contains("@") && password != null;
    }

    @Override
    public boolean authorize(double amount) {
        // Simulate payment authorization
        System.out.println("Authorizing PayPal payment of $" + amount);
        return true;
    }
}
