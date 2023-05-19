package clean.code.design_patterns.requirements;

public class ShoppingListBuilder {

    private ShoppingList shoppingList = new ShoppingList();

    public ShoppingListBuilder addProduct(String name, double price,float quantity) {
        Product product = new Product(name, price,quantity);
        shoppingList.addProduct(product);
        return this;
    }

    public ShoppingList build() {
        return shoppingList;
    }
}
