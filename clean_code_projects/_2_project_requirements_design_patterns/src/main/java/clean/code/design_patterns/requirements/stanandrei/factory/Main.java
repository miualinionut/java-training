package clean.code.design_patterns.requirements.stanandrei.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();

        Pizza newYorkCheesePizza = newYorkPizzaStore.orderPizza();
        System.out.println("Pizza comandata: " + newYorkCheesePizza.name);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza();
        System.out.println("Pizza comandata: " + chicagoPepperoniPizza.name);
    }
}
