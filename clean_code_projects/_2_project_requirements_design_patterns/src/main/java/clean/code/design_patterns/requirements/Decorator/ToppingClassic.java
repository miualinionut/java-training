package clean.code.design_patterns.requirements.Decorator;

public class ToppingClassic extends Decorator {
    public ToppingClassic(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String pizzaElements() {
        return pizza.pizzaElements() + "; Pizza Topping: " + getPizzaTopping();
    }

    private String getPizzaTopping() {
        return "mozzarella, bacon, olives, mushrooms";
    }

    @Override
    public double cost() {
        return pizza.cost() + 10;
    }
}
