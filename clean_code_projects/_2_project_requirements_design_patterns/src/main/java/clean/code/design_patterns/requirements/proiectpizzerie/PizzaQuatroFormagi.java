package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.Arrays;

public class PizzaQuatroFormagi extends Pizza {

    PizzaQuatroFormagi(String marimePizza){
        setMarimePizza(marimePizza);
        setIngrediente(Arrays.asList("parmezan","ricotta","gorgonzola","mozzarella","masline"));
        setNumePizza("Pizza Quatro Formagi");
        setPret(20 * valoareMultiplicator());
    }

}
