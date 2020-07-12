package _2_project_requirements_design_patterns.car;

public class Ford implements Car {
    @Override
    public String getManufacturer()
    {
        return "Ford";
    }

    @Override
    public String getEngine() {
        return "2.0L L4 DOHC 16-valve";
    }

    @Override
    public String getPower() {
        return "160 hp @ 6500 rpm";
    }

    @Override
    public String getTransmission() {
        return "6-speed automatic transmission";
    }
}
