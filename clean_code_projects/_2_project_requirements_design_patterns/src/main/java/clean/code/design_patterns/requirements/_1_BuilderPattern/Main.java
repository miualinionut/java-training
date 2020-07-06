package clean.code.design_patterns.requirements._1_BuilderPattern;

public class Main {
    public static void main(String[] args) {
        ConstructPizza newPizza = new ConstructPizza();
        AbsPizza ananas = new AnanasPizza();
        AbsPizza hot = new HotPizza();

        newPizza.setAbsPizza(ananas);
        newPizza.pizzaConstructer();

        Pizza pizza = newPizza.getPizza();
    }
}
