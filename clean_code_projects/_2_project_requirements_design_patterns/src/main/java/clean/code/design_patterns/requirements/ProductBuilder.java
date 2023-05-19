package clean.code.design_patterns.requirements;

public class ProductBuilder {
    private String name;
    private double price;
    private int purchases;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setPurchases(int purchases) {
        this.purchases = purchases;
        return this;
    }

    public Product createProduct() {
        return new Product(name, price, purchases);
    }
}