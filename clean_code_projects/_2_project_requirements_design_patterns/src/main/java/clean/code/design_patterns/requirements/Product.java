package clean.code.design_patterns.requirements;

public class Product {
    private String productName;
    private double price;
    private float quantity;

    public Product(String name, double price, float quantity) {
        this.productName = name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public float getQuantity(){
        return  quantity;
    }


}