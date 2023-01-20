package clean.code.design_patterns.requirements;

public class HyundaiVehicleBuilder implements VehicleBuilder{

    private String model;
    private String brand;
    private String propulsion;
    private String cargoCapacity;
    private String seats;


    public HyundaiVehicleBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public HyundaiVehicleBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public HyundaiVehicleBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public HyundaiVehicleBuilder propulsion(String propulsion) {
        this.propulsion = propulsion;
        return this;
    }

    @Override
    public HyundaiVehicleBuilder cargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }
    @Override
    public HyundaiVehicle build() {
        return new HyundaiVehicle( model,  brand,  propulsion,  cargoCapacity,  seats);
    }



}
