package project_design_pattern_bridge.WorkShop;

import project_design_pattern_bridge.Vehicles.Vehicle;

import java.util.concurrent.TimeUnit;

public class PaintWorkShop implements WorkShop {
    public PaintWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Painting... ");
        long timeToTake = 100L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            System.out.println("Interrupted");
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
