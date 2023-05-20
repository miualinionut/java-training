package clean.code.design_patterns.requirements.stanandrei.factory;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new PepperoniPizza();
    }
}