package clean.code.design_patterns.requirements;

public class Product {
    private String name;
    private double price;
    private int purchases;

    public Product(String name, double price, int purchases) {
        this.name = name;
        this.price = price;
        this.purchases = purchases;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPurchases() {
        return purchases;
    }
}
