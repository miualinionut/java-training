public class Beverage extends Product {
    public Beverage() {
        super();
    }

    public Beverage(String name, float value) {
        super.setName(name);
        super.setPrice(value);
    }

    @Override
    public void getPriceReduced() {
        super.setPrice(super.getPrice() - (super.getPrice() * 5) / 100);
    }
}
