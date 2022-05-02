package main.java.clean.code.design_patterns.requirements.Decorator;

public class Milk extends Add{
    public Milk(Coffee cof) {
        super("Milk", cof);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 10;
    }
}
