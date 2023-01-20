package clean.code.design_patterns.requirements;

public class SiemensTrain implements Train{

    private String model;
    private String brand;
    private String propulsion;
    private String cargoCapacity;
    private String seats;

    public SiemensTrain() {

    }

    @Override
    public void assemble() {

    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public SiemensTrain(String model, String brand, String propulsion, String cargoCapacity, String seats) {
        this.model = model;
        this.brand = brand;
        this.propulsion = propulsion;
        this.cargoCapacity = cargoCapacity;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "SiemensTrain{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", propulsion='" + propulsion + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }
}
