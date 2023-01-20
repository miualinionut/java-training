package clean.code.design_patterns.requirements;

public interface TrainBuilder {

    public TrainBuilder model(String model);
    public TrainBuilder brand(String brand);
    public TrainBuilder seats(String seats);
    public TrainBuilder propulsion(String propulsion);
    public TrainBuilder cargoCapacity(String cargoCapacity);
    public Train build();
}
