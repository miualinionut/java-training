import java.util.ListIterator;

public class Test {
    ShopSingleton shop;

    public Test() {
        shop = new ShopSingleton();
    }

    public void addProduct(Product p) {
        if (shop.getInstance().products.contains(p))
            return;
        else shop.getInstance().products.add(p);
    }

    public void removeProduct(Product p) {
        ListIterator iterator = shop.getInstance().products.listIterator();
        while (iterator.hasNext()) {
            Product pi = (Product) iterator.next();
            if (pi.getPrice() == p.getPrice() && pi.getName().equals(p.getName()))
                iterator.remove();
        }
    }


    public Product getCheapestProduct() {
        float minimum = 100000000;
        Product minip = null;
        for (Product p : shop.getInstance().products) {
            if (p.getPrice() < minimum) {
                minimum = p.getPrice();
                minip = p;
            }
        }
        if (minip != null)
            return minip;
        else
            return null;
    }

    public static void main(String[] args) {
        //has only one instance of the shop with its name and all the properties of the provided objects
        Test shop = new Test();

        //used for creating the factory object for determining the properties of each product type
        ProductFactory pf = new ProductFactory();

        shop.addProduct(pf.factory("Food", "apa", (float) 2));
        shop.addProduct(pf.factory("Food", "paine", (float) 1.5));
        shop.addProduct(pf.factory("Computer", "PC", (float) 50000));
        shop.addProduct(pf.factory("Clothes", "rochie", (float) 100));

        shop.shop.showProducts();
        System.out.println();
    }

}
