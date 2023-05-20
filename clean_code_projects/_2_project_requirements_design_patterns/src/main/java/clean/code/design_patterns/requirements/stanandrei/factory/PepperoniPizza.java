package clean.code.design_patterns.requirements.stanandrei.factory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pizza cu salam";
        dough = "Blat gros";
        sauce = "Sos de rosii";
        toppings.add("Salam");
        toppings.add("Ciuperci");
        toppings.add("Ceapa");
    }
}