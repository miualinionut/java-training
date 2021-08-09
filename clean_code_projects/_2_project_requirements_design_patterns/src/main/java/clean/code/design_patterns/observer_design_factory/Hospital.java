package clean.code.design_patterns.observer_design_factory;

import javax.print.Doc;
import java.util.LinkedList;

public class Hospital {

    private static HospitalManager hm = HospitalManager.getInstance();
    private static LinkedList<Patient> patients;
    public static LinkedList<Patient> GetPatients() {
        return patients;
    }

    public static int getMaxSeverity() {
        int maxSeverity = 0;
        for (Patient p : patients) {
            if (p.getSituation().getSeverity() > maxSeverity) {
                maxSeverity = p.getSituation().getSeverity();
            }
        }
        return maxSeverity;
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("John", 53, "diabetes", 3);
        Patient p2 = new Patient("Romeo", 31, "pneumonia", 6);
        Patient p3 = new Patient("Johnella", 22, "fever", 3);

        patients = new LinkedList<>();
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);


        Doctors doctors = new Doctors();
        Nurses nurses = new Nurses();
        hm.addObserver(doctors);
        hm.addObserver(nurses);

        while (getMaxSeverity() > 0) {
            hm.update();
        }
        System.out.println("All patients have been treated successfully.");
    }
}
