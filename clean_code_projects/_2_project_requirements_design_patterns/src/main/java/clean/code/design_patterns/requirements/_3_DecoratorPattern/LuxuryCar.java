package clean.code.design_patterns.requirements._3_DecoratorPattern;

public class LuxuryCar extends AbstractCarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + decorareLuxury();
    }

    public String decorareLuxury(){
        return "cu functionalitati de lux";
    }
}
