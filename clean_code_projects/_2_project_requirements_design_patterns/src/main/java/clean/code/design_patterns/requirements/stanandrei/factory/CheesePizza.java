package clean.code.design_patterns.requirements.stanandrei.factory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Pizza cu branza";
        dough = "Blat subtire";
        sauce = "Sos de rosii";
        toppings.add("Mozzarella");
        toppings.add("Parmezan");
    }
}