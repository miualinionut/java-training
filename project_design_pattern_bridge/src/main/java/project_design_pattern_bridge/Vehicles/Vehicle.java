package project_design_pattern_bridge.Vehicles;

import project_design_pattern_bridge.WorkShop.WorkShop;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected List<WorkShop> workshops = new ArrayList<WorkShop>();

    public Vehicle() {
        super();
    }

    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int minWorkTime();
}
