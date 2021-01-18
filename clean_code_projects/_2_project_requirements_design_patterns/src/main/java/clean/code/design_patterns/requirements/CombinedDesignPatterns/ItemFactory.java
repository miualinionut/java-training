package clean.code.design_patterns.requirements.CombinedDesignPatterns;

public class ItemFactory {
    public Items PizzaType(String item) {
        if ("PizzaVeggieSmall".equals(item)) {
            return new VeggiePizza.Builder("PizzaVeggieSmall", 500, 30, 1, 300, true)
                    .setCheese("Mozzarela")
                    .setOnions(true)
                    .setTomatoes(false)
                    .build();
        } else if ("PizzaVeggieMedium".equals(item)) {
            return new VeggiePizza.Builder("PizzaVeggieMedium", 700, 40, 2, 500, true)
                    .setCheese("Mozzarela")
                    .setBabySpinach(true)
                    .setBabySpinach(true)
                    .setOnions(false)
                    .build();
        } else if ("PizzaVeggieLarge".equals(item)) {
            return new VeggiePizza.Builder("PizzaVeggieLarge", 900, 60, 3, 700, true)
                    .setCheese("Mozzarela")
                    .setBabySpinach(true)
                    .setRedPeppers(true)
                    .setCheese("Feta")
                    .build();
        } else if ("PizzaSalamiSmall".equals(item)) {
            return new NonVeggiePizza.Builder("PizzaSalamiSmall", 700, 35, 1, 400, true)
                    .setCheese("Mozzarela")
                    .setBacon(true)
                    .setBlackOlives(true)
                    .setMushrooms(false)
                    .build();
        } else if ("PizzaSalamiMedium".equals(item)) {
            return new NonVeggiePizza.Builder("PizzaSalamiMedium", 1000, 45, 2, 700, true)
                    .setCheese("Mozzarela")
                    .setBacon(true)
                    .setTomatoes(true)
                    .setPepperoni(true)
                    .setSousage(true)
                    .build();
        } else if ("PizzaSalamiLarge".equals(item)) {
            return new NonVeggiePizza.Builder("PizzaSalamiLarge", 1300, 55, 3, 900, true)
                    .setCheese("Mozzarela")
                    .setBacon(true)
                    .setTomatoes(true)
                    .setOnions(true)
                    .setMushrooms(true)
                    .setPepperoni(false)
                    .build();
        }
        return null;
    }

}

