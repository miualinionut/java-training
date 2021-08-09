package _2_adapter_design_pattern_project;

public class Sensor {
    private int value;
    private int minValue;
    private int maxValue;

    public Sensor() {
        this.value = 15;
        this.minValue = -50;
        this.maxValue = 250;
    }

    public Sensor(int val, int min, int max) {
        this.value = val;
        this.minValue = min;
        this.maxValue = max;
    }

    public int getValue() {
        return this.value;
    }
    public void setValue(int val) {
        this.value = val;
    }

    public int getMinValue() {
        return this.minValue;
    }
    public void setMinValue(int val) {
        this.minValue = val;
    }

    public int getMaxValue() {
        return this.maxValue;
    }
    public void setMaxValue(int val) {
        this.maxValue = val;
    }

    public String toString() {
        return "Sensor: " + this.value + "oC (current), " + this.minValue + "oC (minimum), " + this.maxValue + "oC (maximum)";
    }
}
