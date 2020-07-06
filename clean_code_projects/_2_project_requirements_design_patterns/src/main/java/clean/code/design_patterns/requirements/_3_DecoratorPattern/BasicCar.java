package clean.code.design_patterns.requirements._3_DecoratorPattern;

public class BasicCar extends AbstractCarDecorator{
    public BasicCar(Car car) {
        super(car);
    }

    @Override
    public String create() {
        return super.create() + decorateBasicCar();
    }

    private String decorateBasicCar(){
        return "cu pret mediu spre mic";
    }
}
