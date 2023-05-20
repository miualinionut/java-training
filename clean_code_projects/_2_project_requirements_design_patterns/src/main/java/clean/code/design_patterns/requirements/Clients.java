//Template Method Pattern

public abstract class Clients {
    public final void messages(){
        milk();
        flavour();
        typeOfFlavour();
        typeOfCup();
    }

    public abstract boolean milk();
    public abstract boolean flavour();
    public abstract String typeOfFlavour();
    public abstract String typeOfCup();
}

