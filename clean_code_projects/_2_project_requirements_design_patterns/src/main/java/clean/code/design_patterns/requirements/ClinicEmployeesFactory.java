package clean.code.design_patterns.requirements;

public class ClinicEmployeesFactory {
    public static Employee getEmployee(String type, String name) {
        if ("Doctor".equals(type)) {
            return new Doctor(name);
        } else if ("Nurse".equals(type)) {
            return new Nurse(name);
        } else if ("Anesthesiologist".equals(type)) {
            return new Anesthesiologist(name);
        }
        return null;
    }
}
