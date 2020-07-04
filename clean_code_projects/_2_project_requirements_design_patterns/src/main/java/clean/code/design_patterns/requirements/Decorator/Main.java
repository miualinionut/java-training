package clean.code.design_patterns.requirements.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza PizzaHut = new BasicPizza();
        Pizza crust = new Crust(PizzaHut);
        Pizza toppingClassic = new ToppingClassic(crust);
        Pizza sauce = new Sauce(toppingClassic);


        System.out.println(sauce.pizzaElements());
        System.out.println("Total cost: " + sauce.cost() + " RON");
    }
}
