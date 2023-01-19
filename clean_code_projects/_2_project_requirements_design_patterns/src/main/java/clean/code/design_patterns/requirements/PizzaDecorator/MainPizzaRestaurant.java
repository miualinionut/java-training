package clean.code.design_patterns.requirements.PizzaDecorator;

public class MainPizzaRestaurant {
    public static void main(String[] args){

        MozzarelaPizza mozzarelaPizza = new MozzarelaPizza(new BasePizza());
        mozzarelaPizza.showPizzaName();
        mozzarelaPizza.showIngredients();
        System.out.println(mozzarelaPizza.getCost());
        System.out.println();

        MushroomPizza mushroomPizza = new MushroomPizza((new BasePizza()));
        mushroomPizza.addIngredient(new Ingredient("ceapa", 4));
        mushroomPizza.showPizzaName();
        mushroomPizza.showIngredients();
        System.out.println(mushroomPizza.getCost());
        System.out.println();

        Ingredient corn = new Ingredient("porumb", 2);
        Pizza customPizzaIoana = new BasePizza("customPizzaIoana");
        customPizzaIoana.addIngredient(new Ingredient("porumb", 2));
        customPizzaIoana.addIngredient(new Ingredient("sunca", 3));
        customPizzaIoana.addIngredient(new Ingredient("ceapa", 4));
        customPizzaIoana.showPizzaName();
        customPizzaIoana.showIngredients();
        System.out.println(customPizzaIoana.getCost());
        System.out.println();

        Ingredient pepper = new Ingredient("ardei", 2);
        Pizza customPizzaMihai = new BasePizza("customPizzaMihai");
        customPizzaMihai.addIngredient(new Ingredient("ardei", 4));
        customPizzaMihai.showPizzaName();
        customPizzaMihai.showIngredients();
        System.out.println(customPizzaMihai.getCost());
        System.out.println();


    }
}
