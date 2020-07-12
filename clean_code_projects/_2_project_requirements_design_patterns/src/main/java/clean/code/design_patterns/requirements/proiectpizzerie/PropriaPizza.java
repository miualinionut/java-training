package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.Arrays;
import java.util.List;

public class PropriaPizza extends Pizza {

    public PropriaPizza(String marimePizza, List<String> ingredienteCustomizate){
        setMarimePizza(marimePizza);
        setIngrediente(ingredienteCustomizate);
        setNumePizza("Propria Pizza");
        setPret((10 + ingredienteCustomizate.size() * 2) * valoareMultiplicator());
    }
}
