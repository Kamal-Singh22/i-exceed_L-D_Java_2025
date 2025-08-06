abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Method to be overridden by subclasses
    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: "+amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment c_payment = new CreditCardPayment(50000.00, "1234-3456-543-23456", "Ankit Gupta");
        c_payment.processPayment();
    }
}
