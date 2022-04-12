package clean.code.design_patterns.requirements;

public interface PaymentStrategy {
    void makePayment(Double price);
    void change(Double price, Double pay);
}

