package clean.code.design_patterns.requirements;

import java.util.List;

public class MyIteratorImplementation implements MyIterator {
    private List<Product>list;
    private int productIndex;

    public MyIteratorImplementation(List<Product>list){
        this.list=list;
    }

    @Override
    public boolean hasNext() {
        return productIndex<list.size();
    }

    @Override
    public Product next() {
        return list.get(productIndex++);
    }
}
