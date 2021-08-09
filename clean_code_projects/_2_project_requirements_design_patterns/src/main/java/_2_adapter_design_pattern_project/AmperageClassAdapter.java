package _2_adapter_design_pattern_project;

public class AmperageClassAdapter extends Amperage implements AmperageAdapter {
    @Override
    public double getMinus50to250() {
        Sensor s = getAmperage();
        s.setMinValue(-50);
        s.setMaxValue(250);
        s.setValue(25);
        this.amperage = calculateAmperage(s.getValue(), s.getMinValue(), s.getMaxValue());
        return this.amperage;
    }

    @Override
    public double getMinus200to600() {
        Sensor s = getAmperage();
        s.setMinValue(-200);
        s.setMaxValue(600);
        s.setValue(25);
        this.amperage = calculateAmperage(s.getValue(), s.getMinValue(), s.getMaxValue());
        return this.amperage;
    }

    @Override
    public double getMinus200to1750() {
        Sensor s = getAmperage();
        s.setMinValue(-200);
        s.setMaxValue(1750);
        s.setValue(25);
        this.amperage = calculateAmperage(s.getValue(), s.getMinValue(), s.getMaxValue());
        return this.amperage;
    }

    @Override
    public double getMinus70to150() {
        Sensor s = getAmperage();
        s.setMinValue(-70);
        s.setMaxValue(150);
        s.setValue(25);
        this.amperage = calculateAmperage(s.getValue(), s.getMinValue(), s.getMaxValue());
        return this.amperage;
    }

    @Override
    public double getNonStandardAmp(Sensor s) {
        this.amperage = calculateAmperage(s.getValue(), s.getMinValue(), s.getMaxValue());
        return this.amperage;
    }

    public double calculateAmperage(int val, int min, int max) {
        return (((20 - 4)/(double)(max - min)) * (val - min) + 4);
    }
}
