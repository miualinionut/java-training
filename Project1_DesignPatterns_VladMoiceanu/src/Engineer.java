public class Engineer {

    private CarBuilder carBuilder;

    public Engineer (CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar () {
        return this.carBuilder.getCar();
    }

    public void constructCar() {
        this.carBuilder.buildEngine();
        this.carBuilder.buildBody();
        this.carBuilder.buildWheels();
    }
}
