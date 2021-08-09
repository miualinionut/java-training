package clean.code.design_patterns.factory_design_pattern;

public class Shop {

    public static void main(String[] args) {
        ShopFactory shopFactory = new ShopFactory();
        Client client = new Client("Andreea", 30);
        Product product1 = shopFactory.getProduct("FRUIT", "BANANA", 5);
        Product product2 = shopFactory.getProduct("VEGETABLE", "TOMATO", 3);
        Product product3 = shopFactory.getProduct("FRUIT", "ORANGE", 2);
        Product product4 = shopFactory.getProduct("VEGETABLE", "CUCUMBER", 1);

        client.AddProduct(product1);
        client.AddProduct(product2);
        client.AddProduct(product3);
        client.AddProduct(product4);

        client.ListProducts();
        client.CheckOut();

        client.AddProduct(product1);
        client.AddProduct(product2);

        client.ListProducts();
        client.CheckOut();

    }
}
