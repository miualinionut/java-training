package clean.code.design_patterns.requirements._1_BuilderPattern;

public class ConstructPizza {
    private AbsPizza builderPizza;

    public void setAbsPizza(AbsPizza bp){
        this.builderPizza = bp;
    }

    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void pizzaConstructer(){
        builderPizza.newPizza();
        builderPizza.creeazaAluat();
        builderPizza.creeazaSos();
        builderPizza.creeazaTopping();
    }
}
