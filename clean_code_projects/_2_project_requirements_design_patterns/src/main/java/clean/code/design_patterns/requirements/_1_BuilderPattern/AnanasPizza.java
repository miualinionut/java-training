package clean.code.design_patterns.requirements._1_BuilderPattern;

public class AnanasPizza extends AbsPizza{
    @Override
    public void creeazaAluat() {
        pizza.setAluat("integral");
    }

    @Override
    public void creeazaSos() {
        pizza.setSos("dulce");
    }

    @Override
    public void creeazaTopping() {
        pizza.setTopping("ananas");
    }
}
