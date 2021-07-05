public class Renault implements CarBuilder {

    private Car car;

    public Renault() {
        this.car = car;
    }

    @Override
    public void buildEngine() {
        car.setCarEngine("Gaz");
    }

    @Override
    public void buildBody() {
        car.setCarBody("Black");
    }

    @Override
    public void buildWheels() {
        car.setCarWheels("Pirelli");
    }

    public Car getCar() {
        return this.car;
    }
}