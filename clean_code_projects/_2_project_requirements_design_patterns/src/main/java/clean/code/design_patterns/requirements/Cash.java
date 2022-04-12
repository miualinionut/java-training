package clean.code.design_patterns.requirements;

public class Cash implements PaymentStrategy {
    public void makePayment(Double price) {
        System.out.println("You paid "+ price + " RON  by cash");
    }
    public void change(Double price, Double pay){
        System.out.println("Your change is " +  (pay-price) + " RON");
    }

}
