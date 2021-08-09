package _2_adapter_design_pattern_project;

public class Amperage {
    protected double amperage;

    public Sensor getAmperage() {
        return new Sensor();
    }
    public Sensor getAmperage(int val, int min, int max) {
        return new Sensor(val, min, max);
    }
    public void setAmperage(double amp) {
        this.amperage = amp;
    }
    public String toString() {
        return "Amperage: " + amperage + " mV";
    }
}
