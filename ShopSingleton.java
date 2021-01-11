import java.util.ArrayList;

public class ShopSingleton implements Singleton{
    public String name;
    public ArrayList<Product> products;

    public ShopSingleton(){
        name = new String();
        products = new ArrayList<Product>();
    }

    public void showProducts(){
        for(Product p : products){
            System.out.println(p.toString());
        }
    }

    @Override
    public ShopSingleton getInstance() {
        ShopSingleton obj = new ShopSingleton();
        obj.name = this.name;
        obj.products = this.products;
        if(obj == null)
            return new ShopSingleton();
        return obj;
    }
}
