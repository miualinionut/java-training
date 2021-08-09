package clean.code.design_patterns.observer_design_factory;

import java.util.Observable;

public class HospitalManager extends Observable {
    private static HospitalManager hm = null;

    private HospitalManager() {

    }

    public static HospitalManager getInstance() {
        if (hm == null) {
            hm = new HospitalManager();
        }
        return hm;
    }

    public void update() {
        this.setChanged();
        this.notifyObservers();
    }
}
