package clean.code.design_patterns.factory_design_pattern;

public class Vegetable implements Product {

    int price;
    int quantity;
    String vegetable;
    boolean vegetableNotAvailable;

    Vegetable(String vegetable, int quantity) {
        vegetableNotAvailable = false;
        this.quantity = quantity;
        this.vegetable = vegetable;
        switch (vegetable) {
            case "TOMATO":
                price = 5;
                break;
            case "LETTUCE":
                price = 4;
                break;
            case "ZUCCHINI":
                price = 10;
                break;
            case "POTATO":
                price = 3;
                break;
            default:
                price = 0;
                vegetableNotAvailable = true;
                break;
        }
    }

    @Override
    public int getPrice() {
        return price * quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void getInfo() {
        if (vegetableNotAvailable) {
            System.out.println("The requested vegetable: " + vegetable + " is not available in our shop.");
            return;
        }
        System.out.println("Selected " + vegetable + ": " + getQuantity() + "; price: " + getPrice());
    }
}
