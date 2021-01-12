package clean.code.design_patterns.requirements;

public abstract class DrinkMaker {
    private Drink drink;
    public Drink getDrink() {
        return drink;
    }
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    public final Drink makeDrink(){
        Drink drink = createDrink();
        setDrink(drink);
        setJuice();
        setWater();
        setSugar();
        setComponents();
        setType();
        return drink;
    }
    abstract Drink createDrink();
    abstract void setType();
    abstract void setWater();
    abstract void setJuice();
    abstract void setSugar();
    abstract void setComponents();

}
