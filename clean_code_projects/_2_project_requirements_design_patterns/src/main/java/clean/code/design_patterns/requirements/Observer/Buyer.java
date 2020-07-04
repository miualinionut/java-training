package clean.code.design_patterns.requirements.Observer;

public class Buyer implements Client{
    private Shop product;
    public Buyer(Shop product){
        this.product=product;
        this.product.register(this);

    }

    @Override
    public void update(int available) {
        if(available!=0)
        {
            System.out.println("Produsul a revenit in stoc. Sunt  " + available + " produse in stoc.");
        }
        else {
            System.out.println("Produsul nu mai este in stoc.");
        }
    }

    public void unsubscribe(){
        this.product.remove(this);
    }
}
