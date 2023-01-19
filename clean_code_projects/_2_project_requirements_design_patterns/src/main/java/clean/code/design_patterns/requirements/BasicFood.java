package clean.code.design_patterns.requirements;

public class BasicFood implements Food {
    private double price;
    private String name;

    public BasicFood(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
