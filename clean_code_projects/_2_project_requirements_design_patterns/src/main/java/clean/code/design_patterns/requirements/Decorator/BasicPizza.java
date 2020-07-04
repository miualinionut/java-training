package clean.code.design_patterns.requirements.Decorator;

public class BasicPizza implements Pizza {

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String pizzaElements() {
        return "Pizza details: ";
    }


}
