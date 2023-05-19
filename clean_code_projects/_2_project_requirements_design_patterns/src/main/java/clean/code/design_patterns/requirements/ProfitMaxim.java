package clean.code.design_patterns.requirements;

import java.lang.reflect.Array;

public class ProfitMaxim extends TemplateMethodPattern{

    @Override
    public void lista(Product[] products) {
        this.products = products;

    }

    @Override
    public void determinare_maxim() {
        // calcul dorit -> products_result
        double maxim = 0;
        int i = 0;
        for( Product product : products) {
            if(product.getPrice() * product.getPurchases() > maxim)
                maxim = product.getPrice() * product.getPurchases();
        }
        for( Product product : products) {
            if (product.getPrice() * product.getPurchases() == maxim) {
                System.out.println(product.getName());
            }
        }
        }
}
