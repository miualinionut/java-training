package clean.code.design_patterns.requirements;

import java.sql.Array;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        Product product1 = new ProductBuilder()
                .setName("Theo")
                .setPrice(12.2)
                .setPurchases(10)
                .createProduct();
        Product product2 = new ProductBuilder()
                .setName("Altcnv")
                .setPrice(15.1)
                .setPurchases(2)
                .createProduct();

        Product[] produse = {product1, product2};

        TemplateMethodPattern algoritm = new ProfitMaxim();
        algoritm.lista(produse);
        algoritm.determinare_maxim();
    }
}

