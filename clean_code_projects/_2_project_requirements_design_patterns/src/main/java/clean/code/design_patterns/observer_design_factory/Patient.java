package clean.code.design_patterns.observer_design_factory;

public class Patient {
    private String name;
    private int age;
    private Doctors doctor;
    private Situation situation;

    Patient(String name, int age, String illness, int severity) {
        this.name = name;
        this.age = age;
        situation = new Situation(illness, severity);
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSeverity(int severity) {
        this.situation.setSeverity(severity);
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void printInfo() {
        System.out.println("Patient " + name + " has illness " + situation.getIllness() + " with severity " + situation.getSeverity());
    }
}
