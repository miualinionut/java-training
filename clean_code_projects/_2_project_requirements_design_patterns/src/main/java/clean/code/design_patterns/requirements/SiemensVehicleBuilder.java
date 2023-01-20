package clean.code.design_patterns.requirements;

public class SiemensVehicleBuilder implements VehicleBuilder{

    private String model;
    private String brand;
    private String propulsion;
    private String cargoCapacity;
    private String seats;

    @Override
    public VehicleBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public VehicleBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public VehicleBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public VehicleBuilder propulsion(String propulsion) {
        this.propulsion = propulsion;
        return this;
    }

    @Override
    public VehicleBuilder cargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    @Override
    public SiemensVehicle build() {
        return new SiemensVehicle( model,  brand,  propulsion,  cargoCapacity,  seats);
    }

}
