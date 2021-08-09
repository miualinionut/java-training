package clean.code.design_patterns.factory_design_pattern;

public class Fruit implements Product {

    int price;
    int quantity;
    String fruit;
    boolean fruitNotAvailable;

    Fruit(String fruit, int quantity) {
        fruitNotAvailable = false;
        this.quantity = quantity;
        this.fruit = fruit;
        switch (fruit) {
            case "BANANA":
                price = 2;
                break;
            case "PINEAPPLE":
                price = 5;
                break;
            case "ORANGE":
                price = 4;
                break;
            case "APPLE":
                price = 1;
                break;
            default:
                price = 0;
                fruitNotAvailable = true;
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
        if (fruitNotAvailable) {
            System.out.println("The requested fruit: " + fruit + " is not available in our shop.");
            return;
        }
        System.out.println("Selected " + fruit + ": " + getQuantity() + "; price: " + getPrice());
    }
}
