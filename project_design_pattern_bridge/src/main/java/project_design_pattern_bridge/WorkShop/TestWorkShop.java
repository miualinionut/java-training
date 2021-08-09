package project_design_pattern_bridge.WorkShop;

import project_design_pattern_bridge.Vehicles.Vehicle;

import java.util.concurrent.TimeUnit;

public class TestWorkShop implements WorkShop {
    public TestWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Testing... ");
        long timeToTake = 50L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            System.out.println("Interrupted");
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}