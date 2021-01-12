package clean.code.design_patterns.requirements;

public class Cocktail extends DrinkMaker{
    void setType() {
        getDrink().setName("cocktail");
    }
    @Override
    void setWater() {
        getDrink().setWater(0);
    }

    @Override
    void setJuice() {
        System.out.println("Adding 50ml of fresh orange juice and 50 ml cranberry juice");
        getDrink().setJuice(100);
    }
    @Override
    void setSugar() {
        System.out.println("Adding a bit of sugar");
        getDrink().setSugar(1);
    }

    @Override
    void setComponents() {
        System.out.println("Adding 50ml of vodka and special component");
        getDrink().setComponents("Vodka&secret");
    }

    @Override
    Drink createDrink() {
        return new Drink();
    }
}
