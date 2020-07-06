package clean.code.design_patterns.requirements._3_DecoratorPattern;

public abstract class AbstractCarDecorator implements Car {
    private Car car;

    public AbstractCarDecorator(Car car) {
        this.car = car;
    }

    public String create(){
        return car.create();
    }
}
