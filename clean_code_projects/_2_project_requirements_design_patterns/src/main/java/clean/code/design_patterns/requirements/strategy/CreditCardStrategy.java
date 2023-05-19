package clean.code.design_patterns.requirements.strategy;

// Concrete strategy classes
class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using credit card: " + cardNumber);
        // Add logic for credit card payment processing
    }
}