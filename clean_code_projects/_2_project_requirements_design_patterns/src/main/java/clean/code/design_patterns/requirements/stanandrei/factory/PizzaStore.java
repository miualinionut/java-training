package clean.code.design_patterns.requirements.stanandrei.factory;

public abstract class PizzaStore {
    public Pizza orderPizza() {
        Pizza pizza = createPizza();

        pizza.prepare();
        pizza.bake();
        return pizza;
    }

    protected abstract Pizza createPizza();
}
