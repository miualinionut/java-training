package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.Arrays;

public class PizzaVegetariana extends Pizza {

    PizzaVegetariana(String marimePizza){
        setMarimePizza(marimePizza);
        setIngrediente(Arrays.asList("Tofu","Masline","Ceapa","Ardei","Rosii"));
        setNumePizza("Pizza Vegetariana");
        setPret(10 * valoareMultiplicator());
    }
}
