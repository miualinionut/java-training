package project_design_pattern_bridge.WorkShop;

import project_design_pattern_bridge.Vehicles.Vehicle;

import java.util.concurrent.TimeUnit;

public class AssembleWorkShop implements WorkShop {
    public AssembleWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Assembling... ");
        long timeToTake = 200L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            System.out.println("Interrupted");
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
