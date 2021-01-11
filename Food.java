public class Food extends Product {
    public Food() {
        super();
    }

    public Food(String name, float value) {
        super.setName(name);
        super.setPrice(value);
    }

    @Override
    public void getPriceReduced() {
        super.setPrice(super.getPrice() - (super.getPrice() * 20) / 100);
    }
}
