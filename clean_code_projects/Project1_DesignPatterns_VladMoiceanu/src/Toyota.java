public class Toyota implements CarBuilder {

    private Car car;

    public Toyota() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setCarEngine("Electrical");
    }

    @Override
    public void buildBody() {
        car.setCarBody("Metal red");
    }

    @Override
    public void buildWheels() {
        car.setCarWheels("Michelin");
    }

    public Car getCar() {
        return this.car;
    }
}
