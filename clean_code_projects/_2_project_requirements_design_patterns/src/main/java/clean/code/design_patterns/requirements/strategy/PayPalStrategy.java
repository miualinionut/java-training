package clean.code.design_patterns.requirements.strategy;
class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal account: " + email);
        // Add logic for PayPal payment processing
    }
}