public class Book extends Product{
    public Book(){
        super();
    }

    public Book(String name, float value){
        super.setName(name);
        super.setPrice(value);
    }

    @Override
    public void getPriceReduced(){
        super.setPrice(super.getPrice() - (super.getPrice()*15)/100);
    }
}
