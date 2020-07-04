package clean.code.design_patterns.requirements.Decorator;

public class Crust extends Decorator {
    public Crust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String pizzaElements() {
        return pizza.pizzaElements() + "Pizza Crust: " + getPizzaCrust();
    }

    private String getPizzaCrust() {
        return "Thick Crust";
    }

    @Override
    public double cost() {
        return pizza.cost() + 15;
    }


}
