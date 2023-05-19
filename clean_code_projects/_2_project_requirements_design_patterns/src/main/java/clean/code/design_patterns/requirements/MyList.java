package clean.code.design_patterns.requirements;

public interface MyList {

    void addProduct(Product p);

    void removeProduct(String name);

    MyIterator iterator();

}
