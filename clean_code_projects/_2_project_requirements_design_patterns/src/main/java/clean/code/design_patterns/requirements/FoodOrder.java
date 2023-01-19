package clean.code.design_patterns.requirements;

public class FoodOrder {
    private OrderState state;
    private Food food;

    public FoodOrder(Food food) {
        state = new OrderedState();
        this.food = food;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
