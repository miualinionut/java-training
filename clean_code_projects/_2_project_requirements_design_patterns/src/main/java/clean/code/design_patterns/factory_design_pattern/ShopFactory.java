package clean.code.design_patterns.factory_design_pattern;

public class ShopFactory {
    public Product getProduct(String type, String product, int quantity) {
        switch (type) {
            case "FRUIT":
                return new Fruit(product, quantity);
            case "VEGETABLE":
                return new Vegetable(product, quantity);
            default:
                return null;
        }
    }
}
