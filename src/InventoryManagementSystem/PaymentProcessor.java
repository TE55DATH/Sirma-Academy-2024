package InventoryManagementSystem;

public class PaymentProcessor {

    public boolean processPayment(PaymentMethod paymentMethod, double amount) {
        if (paymentMethod.validate()) {
            return paymentMethod.authorize(amount);
        }
        return false;
    }
}

