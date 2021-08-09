package clean.code.design_patterns.observer_design_factory;

public class Situation {
    private String illness;
    private int severity;

    Situation() {

    }

    Situation(String illness, int severity) {
        this.illness = illness;
        this.severity = severity;
    }

    public String getIllness() {
        return  illness;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
