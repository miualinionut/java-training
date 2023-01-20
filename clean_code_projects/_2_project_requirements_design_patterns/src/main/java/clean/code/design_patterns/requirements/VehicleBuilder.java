package clean.code.design_patterns.requirements;

public interface VehicleBuilder {
    public VehicleBuilder model(String model);
    public VehicleBuilder brand(String brand);
    public VehicleBuilder seats(String seats);
    public VehicleBuilder propulsion(String propulsion);
    public VehicleBuilder cargoCapacity(String cargoCapacity);
    public Vehicle build();

}
