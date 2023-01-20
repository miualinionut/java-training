class cafeaLapte extends coffeeDecorator {
    public cafeaLapte(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}