public abstract class coffeeDecorator extends coffee {
    protected coffee decoratedCoffee;
    public coffeeDecorator(coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}