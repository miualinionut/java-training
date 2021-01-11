public class ProductFactory implements  Factory{

    @Override
    public Product factory(String type, String nameProduct, float ProductPrice) {
        Product obj;
        if(type.equals("Book")){
            Book b = new Book(nameProduct, ProductPrice);
            //also reduce book price by 15%
            b.getPriceReduced();
            return b;
        }
        else if(type.equals("Food")){
            Food f = new Food(nameProduct, ProductPrice);
            //also reduce food price by 20%
            f.getPriceReduced();
            return f;
        }
        else if(type.equals("Beverage")){
            Beverage b = new Beverage(nameProduct, ProductPrice);
            //also reduce beverage price by 5%
            b.getPriceReduced();
            return b;
        }
        else if(type.equals("Computer")){
            Computer c = new Computer(nameProduct, ProductPrice);
            //also reduce computer price by 10%
            c.getPriceReduced();
            return c;
        }
        else {
            //for any other produc type do not apply any discount
            Product p = new Product(nameProduct, ProductPrice) {
                @Override
                public void getPriceReduced() {
                    return;
                }
            };
            return p;
        }
    }
}
