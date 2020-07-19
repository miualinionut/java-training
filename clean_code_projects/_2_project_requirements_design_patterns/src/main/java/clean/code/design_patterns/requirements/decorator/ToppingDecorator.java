package clean.code.design_patterns.requirements.decorator;

public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza pizza;
    public ToppingDecorator(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.price;
    }
}
