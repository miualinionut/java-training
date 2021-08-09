package clean.code.design_patterns.observer_design_factory;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Nurses implements Observer {

    private List<Patient> patients;

    Nurses() {
        this.patients = Hospital.GetPatients();

    }

    public void print() {

    }

    @Override
    public void update(Observable o, Object arg) {
        HospitalManager hm = HospitalManager.getInstance();
        if (patients.size() == 0) {
            return;
        }
        System.out.println("Nurses checking on patients:");
        for (Patient p : patients) {
            int severity = p.getSituation().getSeverity();
            if (p.getSituation().getSeverity() == 0 || p.getSituation().getSeverity() > 2) {
//                patients.remove(p);
                continue;
            }
            p.setSeverity(severity-1);
            p.printInfo();
        }
        System.out.println("==============================");

    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
    public List<Patient> getPatients() {
        return patients;
    }
}
