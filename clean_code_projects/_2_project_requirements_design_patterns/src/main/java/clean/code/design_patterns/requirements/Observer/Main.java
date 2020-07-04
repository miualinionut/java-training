package clean.code.design_patterns.requirements.Observer;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Buyer buyer1 = new Buyer(product);
        Buyer buyer2 = new Buyer(product);
        Buyer buyer3 = new Buyer(product);

        product.setInStock(20);
        buyer1.unsubscribe();
        product.setInStock(0);

    }

}
