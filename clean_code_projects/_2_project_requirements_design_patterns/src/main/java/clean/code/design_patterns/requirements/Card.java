package clean.code.design_patterns.requirements;

public class Card implements PaymentStrategy {
    public void makePayment(Double price) {
        System.out.println("You paid "+ price + " RON  by card");
    }
    public void change(Double price, Double pay){
    }
}
