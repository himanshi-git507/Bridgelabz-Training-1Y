class Payment {

    public void process(double amount) {
        System.out.println("Processing payment of: " + amount);
    }
}

class CreditCardPayment extends Payment {

    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of: " + amount);
    }

    public void process(double amount, String currency) {
        System.out.println("Processing credit card payment of: " + amount + " " + currency);
    }
}

public class ConfusingExample {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.process(1000);

        CreditCardPayment cc = new CreditCardPayment();
        cc.process(1000, "USD");
    }
}
