package com.codeofDiane;

public class FinalProductsBuilder {

    public  Product prepareProductPC() {
        Product product = new Product();
        product.addComponent(new PC());
        product.addComponent(new Mouse());
        return product;
    }
    public  Product prepareProductLaptop() {
        Product product = new Product();
        product.addComponent(new Laptop());
        product.addComponent(new CoolerPad());
        product.addComponent(new Mouse());
        return product;
    }
}
