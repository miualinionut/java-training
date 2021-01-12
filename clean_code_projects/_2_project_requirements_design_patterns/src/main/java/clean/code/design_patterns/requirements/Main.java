package clean.code.design_patterns.requirements;

public class Main {

    public static Drink makEaDrink(String type) {
        DrinkMaker drinkmaker = null;
        if(type.equalsIgnoreCase("blacktea")) {
            drinkmaker = new BlackTea();
        }else if (type.equalsIgnoreCase("lemonade"))
            drinkmaker = new Lemonade();
        else if (type.equalsIgnoreCase("cocktail"))
            drinkmaker = new Cocktail();
        else {
            System.out.println("Sorry we don't make " + type);
            return null;
        }
        return drinkmaker.makeDrink();
    }
    public static void main(String[] args) {
        Drink tea = makEaDrink("blacktea");
        System.out.println(tea);
        Drink tea1 = makEaDrink("lemonade");
        System.out.println(tea1);
        OmFactory factory = new OmFactory();
        Om om1 = factory.getOm("A");
        om1.miscare();

        Om om2 = factory.getOm("B");
        om2.miscare();

        Om om3 = factory.getOm(null);
        om3.miscare();
    }
}
