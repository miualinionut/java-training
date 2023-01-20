class cafeaFrisca extends coffeeDecorator {
    public cafeaFrisca(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double getPrice() {
        return super.getPrice() + 3.0;
    }
}
