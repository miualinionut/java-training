package clean.code.design_patterns.requirements.Decorator;

public class ToppingBbqChicken extends Decorator {
    public ToppingBbqChicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String pizzaElements() {
        return pizza.pizzaElements() + "; Pizza Topping: " + getPizzaTopping();
    }

    private String getPizzaTopping() {
        return "mozzarella, chicken, mushrooms, onion, corn";
    }

    @Override
    public double cost() {
        return pizza.cost() + 15;
    }
}
