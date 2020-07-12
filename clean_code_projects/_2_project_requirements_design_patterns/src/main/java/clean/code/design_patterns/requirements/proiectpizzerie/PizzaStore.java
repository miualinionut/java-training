package clean.code.design_patterns.requirements.proiectpizzerie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaStore {

    private static PizzaStore instanta = new PizzaStore();
    private PizzaStore(){};

    public static PizzaStore getInstanta() {
        return instanta;
    }
    public Pizza comanda(int variantaPizza, String marimePizza){

        switch (variantaPizza){
            case 1:
                return new PizzaQuatroFormagi(marimePizza);
            case 2:
                return new PizzaPeperoni(marimePizza);
            case 3:
                return new PizzaVegetariana(marimePizza);
            case 4:
                return new PropriaPizza(marimePizza, customizarePizza());
            default:
                System.out.println("Pizza aleasa de dvs nu exista!");
                return null;
        }
    }
    private List<String> customizarePizza(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ati selectat optiunea de a va crea propria pizza, va rugam introduceti ingredientele pe care le doriti, iar la sfarsit introduceti cuvantul END urmat de tasta ENTER");
        String ingredient = sc.next();
        List<String> listIngrediente = new ArrayList<>();
        while(!ingredient.toLowerCase().equals("end")){
            listIngrediente.add(ingredient);
            ingredient = sc.next();
        }
        return listIngrediente;
    }
}
