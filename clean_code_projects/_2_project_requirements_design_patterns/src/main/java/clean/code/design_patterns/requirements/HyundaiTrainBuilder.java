package clean.code.design_patterns.requirements;

public class HyundaiTrainBuilder implements TrainBuilder{

    private String model;
    private String brand;
    private String propulsion;
    private String cargoCapacity;
    private String seats;

    public HyundaiTrainBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public HyundaiTrainBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public HyundaiTrainBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public HyundaiTrainBuilder propulsion(String propulsion) {
        this.propulsion = propulsion;
        return this;
    }

    @Override
    public HyundaiTrainBuilder cargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    @Override
    public HyundaiTrain build() {
        return new HyundaiTrain( model,  brand,  propulsion,  cargoCapacity,  seats);
    }

}
