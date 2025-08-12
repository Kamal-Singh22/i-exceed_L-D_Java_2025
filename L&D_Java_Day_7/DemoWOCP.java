abstract class PaymentMethod {
    // Abstract method to be implemented by subclasses
    public abstract double paymentProcess(double amount);

    // Common method to process payment using polymorphism
    public double processType(PaymentMethod method, double amount) {
        return method.paymentProcess(amount);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public double paymentProcess(double amount) {
        System.out.println("Discount for Credit Card: " + (amount * 0.10));
        return amount * 0.90; // 10% discount
    }
}

class DebitCard extends PaymentMethod {
    @Override
    public double paymentProcess(double amount) {
        System.out.println("Discount for Debit Card: " + (amount * 0.12));
        return amount * 0.88; // 12% discount
    }
}

class UPI extends PaymentMethod {
    @Override
    public double paymentProcess(double amount) {
        System.out.println("Discount for UPI: " + (amount * 0.15));
        return amount * 0.85; // 15% discount
    }
}

public class DemoWOCP {
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCard();
        PaymentMethod dc = new DebitCard();
        PaymentMethod upi = new UPI();

        // Using polymorphism to process payment
        System.out.println("Final amount after discount: ₹" + cc.processType(cc, 10000));
        System.out.println("Final amount after discount: ₹" + dc.processType(dc, 10000));
        System.out.println("Final amount after discount: ₹" + upi.processType(upi, 10000));
    }
}
