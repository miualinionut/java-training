package clean.code.design_patterns.requirements.stanandrei.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparam " + name);
        System.out.println("Framantam: " + dough);
        System.out.println("Adaugam sos: " + sauce);
        System.out.println("Adaugam topping-uri:");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Coacem " + name);
    }
}
