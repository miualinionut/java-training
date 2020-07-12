package _2_project_requirements_design_patterns.car;

public class Volkswagen implements Car {

    @Override
    public String getManufacturer() {
        return "Volkswagen";
    }

    @Override
    public String getEngine() {
        return "1.4L TSI";
    }

    @Override
    public String getPower() {
        return "147 hp @ 5000 rpm";
    }

    @Override
    public String getTransmission() {
        return "8-speed automatic transmission with Triptronic";
    }
}
