package clean.code.design_patterns.requirements;

public class InProgressState implements OrderState {
    public void processOrder(FoodOrder order) {
        System.out.println("Order is already in progress");
    }

    public void cancelOrder(FoodOrder order) {
        System.out.println("Order has been cancelled");
        order.setState(new CancelledState());
    }
}
