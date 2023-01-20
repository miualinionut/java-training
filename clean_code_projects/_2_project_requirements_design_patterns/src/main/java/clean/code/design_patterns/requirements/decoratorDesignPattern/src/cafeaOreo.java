public class cafeaOreo extends coffeeDecorator{
    public cafeaOreo(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
