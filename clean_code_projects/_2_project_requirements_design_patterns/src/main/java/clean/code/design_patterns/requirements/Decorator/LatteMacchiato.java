package main.java.clean.code.design_patterns.requirements.Decorator;

public class LatteMacchiato extends Coffee {
    public LatteMacchiato() {
        super("LatteMacchiato");
    }

    @Override
    public double cost() {
        return 25;
    }
}
