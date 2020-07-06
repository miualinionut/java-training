package clean.code.design_patterns.requirements._1_BuilderPattern;

public class HotPizza extends AbsPizza{

    @Override
    public void creeazaAluat() {
        pizza.setAluat("subtire");
    }

    @Override
    public void creeazaSos() {
        pizza.setSos("iute");
    }

    @Override
    public void creeazaTopping() {
        pizza.setTopping("peperoni");
    }
}
