package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingList implements MyList {

    private List<Product> list;

    public ShoppingList() {
        list = new ArrayList<>();
    }

    public void addProduct(Product p) {
        this.list.add(p);
    }

    public void removeProduct(String name) {
        Iterator<Product>it=list.iterator();
        while (it.hasNext()){
            Product p=it.next();
            if(p.getName().equals(name)){
                it.remove();
            }
        }
    }

    @Override
    public MyIterator iterator() {
        return new MyIteratorImplementation(this.list);
    }



}