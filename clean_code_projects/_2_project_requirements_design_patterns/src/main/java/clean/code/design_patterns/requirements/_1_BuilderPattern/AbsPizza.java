package clean.code.design_patterns.requirements._1_BuilderPattern;

public abstract class AbsPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void newPizza(){
        pizza = new Pizza();
    }

    public abstract void creeazaAluat();
    public abstract void creeazaSos();
    public abstract void creeazaTopping();
}
