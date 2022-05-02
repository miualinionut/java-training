package main.java.clean.code.design_patterns.requirements.Decorator;

public class Sugar extends Add{
    public Sugar(Coffee cof) {
        super("Sugar", cof);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.5;
    }
}
