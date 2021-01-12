package clean.code.design_patterns.requirements;

public class Lemonade extends DrinkMaker{
    void setType() {
        getDrink().setName("lemonade");
    }
    @Override
    void setWater() {
        System.out.println("Adding sparkling water into the cup.");
        getDrink().setWater(100);
    }

    @Override
    void setJuice() {
        System.out.println("Adding a fresh lemon juice.");
        getDrink().setJuice(50);
    }
    @Override
    void setSugar() {
        System.out.println("Adding 10g of sugar");
        getDrink().setSugar(10);
    }

    @Override
    void setComponents() {
        System.out.println("Taking a honeybag for our clients");
        getDrink().setComponents("Honey");
    }

    @Override
    Drink createDrink() {
        return new Drink();
    }
}
