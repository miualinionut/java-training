package clean.code.design_patterns.requirements;

public interface OrderState {
    void processOrder(FoodOrder order);
    void cancelOrder(FoodOrder order);
}
