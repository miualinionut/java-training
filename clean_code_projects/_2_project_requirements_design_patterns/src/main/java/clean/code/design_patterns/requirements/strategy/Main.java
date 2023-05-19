package clean.code.design_patterns.requirements.strategy;
// Usage example
public class Main {
    public static void main(String[] args) {
        // Create payment processor
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Set credit card payment strategy
        paymentProcessor.setPaymentStrategy(new CreditCardStrategy("1234567890", "12/25", "123"));

        // Process payment
        paymentProcessor.processPayment(100.0);

        // Set PayPal payment strategy
        paymentProcessor.setPaymentStrategy(new PayPalStrategy("example@gmail.com", "password"));

        // Process payment
        paymentProcessor.processPayment(50.0);
    }
}