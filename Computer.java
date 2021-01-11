public class Computer extends Product {
    public Computer() {
        super();
    }

    public Computer(String name, float value) {
        super.setName(name);
        super.setPrice(value);
    }

    @Override
    public void getPriceReduced() {
        super.setPrice(super.getPrice() - (super.getPrice() * 10) /100);
    }
}
