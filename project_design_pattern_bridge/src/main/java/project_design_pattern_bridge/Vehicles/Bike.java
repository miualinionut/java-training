package project_design_pattern_bridge.Vehicles;

public class Bike extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bike...");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 5;
    }
}
