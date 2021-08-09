package _2_adapter_design_pattern_project;

public interface AmperageAdapter {
    public double getMinus50to250();    // Negative Temperature Coefficient (NTC) thermistor
    public double getMinus200to600();   // Resistance Temperature Detector (RTD)
    public double getMinus200to1750();  // Thermocouples
    public double getMinus70to150();    // Semiconductor-based temperature sensors
    public double getNonStandardAmp(Sensor s);
}
