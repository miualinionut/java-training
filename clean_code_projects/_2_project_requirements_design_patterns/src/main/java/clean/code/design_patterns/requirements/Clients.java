package clean.code.design_patterns.requirements;
//Template Method Pattern
public abstract class Clients {
    public final void messages(){
        salad();
        sauce();
        typeOfSauce();
        typeOfMeat();
    }

    public abstract boolean salad();
    public abstract boolean sauce();
    public abstract String typeOfSauce();
    public abstract String typeOfMeat();
}
