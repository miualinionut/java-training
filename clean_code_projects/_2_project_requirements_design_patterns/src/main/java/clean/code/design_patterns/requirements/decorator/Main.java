package clean.code.design_patterns.requirements.decorator;

class Margherita extends BasePizza {
    public Margherita() {
        this.price = 22;
    }
}

class Gourmet extends BasePizza {
    public Gourmet(){
        this.price = 30;
    }
}

class Vegetarian extends BasePizza {
    public Vegetarian(){
        this.price = 25.5;
    }
}

class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(BasePizza pizza) {
        super(pizza);
        this.price = 1.99;
    }
}

class BaconTopping extends ToppingDecorator{

    public BaconTopping(BasePizza pizza) {
        super(pizza);
        this.price = 2.99;
    }
}

class MushroomTopping extends ToppingDecorator{

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
        this.price = 0.99;
    }
}

public class Main {
    public static void main(String[] args) {
        Margherita margherita = new Margherita();
        System.out.println("Pizza margherita: " + margherita.getPrice() + "RON");
        BasePizza gourmet = new ExtraCheese(new BaconTopping(new Gourmet()));
        System.out.println("Pizza gourmet with extra cheese and bacon topping: " + String.format("%.2f", gourmet.getPrice())  + "RON");
    }
}
