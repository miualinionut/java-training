package clean.code.design_patterns.requirements;

public class SiemensTrainBuilder implements TrainBuilder{

    private String model;
    private String brand;
    private String propulsion;
    private String cargoCapacity;
    private String seats;

    @Override
    public TrainBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public TrainBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public TrainBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public TrainBuilder propulsion(String propulsion) {
        this.propulsion = propulsion;
        return this;
    }

    @Override
    public TrainBuilder cargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    @Override
    public SiemensTrain build() {

        return new SiemensTrain( model,  brand,  propulsion,  cargoCapacity,  seats);
    }

}
