package clean.code.design_patterns.requirements;

public class BlackTea extends DrinkMaker{
    @Override
    Drink createDrink() {
        return new Drink();
    }

    @Override
    void setType() {
        getDrink().setName("tea");
    }

    @Override
    void setWater() {
        System.out.println("Adding water into the cup.");
        getDrink().setWater(250);
    }

    @Override
    void setJuice() {
        getDrink().setJuice(0);
    }
    @Override
    void setSugar() {
        System.out.println("We give 3 of sugat to our clients.");
        getDrink().setSugar(3);
    }

    @Override
    void setComponents() {
        System.out.println("We give a cup of warm milk");
        getDrink().setComponents("WarmMilk");
    }


}
