package _2_adapter_design_pattern_project;

public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor(5, -25, 50);
        Amperage a1 = new Amperage();

        AmperageAdapter adapter = new AmperageClassAdapter();

        a1.setAmperage(adapter.getNonStandardAmp(s1));

        System.out.println(s1.toString() + "; "+ a1.toString());
    }
}
