package clean.code.design_patterns.requirements;

public class CancelledState implements OrderState {
    public void processOrder(FoodOrder order) {
        System.out.println("Order has been cancelled, cannot process");
    }

    public void cancelOrder(FoodOrder order) {
        System.out.println("Order has already been cancelled");
    }
}
