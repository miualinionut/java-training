package clean.code.design_patterns.requirements;

public class OrderedState implements OrderState {
    public void processOrder(FoodOrder order) {
        System.out.println("Order has been processed");
        order.setState(new InProgressState());
    }

    public void cancelOrder(FoodOrder order) {
        System.out.println("Order has been cancelled");
        order.setState(new CancelledState());
    }
}
