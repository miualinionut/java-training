package clean.code.design_patterns.factory_design_pattern;

import java.util.LinkedList;
import java.util.List;

public class Client {
    String name;
    int money;
    List<Product> products;

    Client(String name, int money) {
        this.name = name;
        this.money = money;
        this.products = new LinkedList<>();
    }

    public void AddProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public void ListProducts() {
        int toPay = 0;
        for (Product p : products) {
            toPay += p.getPrice();
            p.getInfo();
        }
        System.out.println("To pay: " + toPay);
    }

    public void CheckOut() {
        int toPay = 0;
        for (Product p : products) {
            toPay += p.getPrice();
        }
        if (money < toPay) {
            System.out.println("Insufficient funds for the selected products. Please try again.");
            System.out.println("Current funds: " + money + " | To pay: " + toPay);
        } else {
            money -= toPay;
            System.out.println("Successfully bought the selected products. Current funds: " + money);
        }
        this.products.clear();
    }

}
