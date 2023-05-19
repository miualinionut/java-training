package clean.code.design_patterns.requirements;

public abstract class TemplateMethodPattern {
    Product [] products;
    Product [] products_result;
    public final void determincare_produs_profit_max (Product[] products){
        lista(products);
        determinare_maxim();
    };
    public abstract void lista(Product[] products);
    public abstract void determinare_maxim();
}
