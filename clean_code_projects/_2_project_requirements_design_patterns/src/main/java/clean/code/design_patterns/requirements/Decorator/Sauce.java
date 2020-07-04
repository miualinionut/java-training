package clean.code.design_patterns.requirements.Decorator;

public class Sauce extends Decorator {
    public Sauce(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String pizzaElements() {
        return pizza.pizzaElements() + "; Pizza Sauce: " + getPizzaSauce();
    }

    private String getPizzaSauce() {
        return "sweet barbeque";
    }

    @Override
    public double cost() {
        return pizza.cost() + 3;
    }
}
