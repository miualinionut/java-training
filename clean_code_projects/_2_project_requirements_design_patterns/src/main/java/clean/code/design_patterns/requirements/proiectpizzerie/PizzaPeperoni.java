package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.Arrays;

public class PizzaPeperoni extends Pizza{

    PizzaPeperoni(String marimePizza){
       setMarimePizza(marimePizza);
       setIngrediente(Arrays.asList("Peperoni","ardei iute","sos iute","mozzarella"));
       setNumePizza("Pizza Peperoni");
       setPret(15 * valoareMultiplicator());
    }

}
