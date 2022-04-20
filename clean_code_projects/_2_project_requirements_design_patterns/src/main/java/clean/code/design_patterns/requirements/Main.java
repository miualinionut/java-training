package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
        The idea of the project is to notify the participating employees from a clinic about scheduled surgeries.
        I used the Factory design pattern in order to create the staff from the clinic, Observer design pattern in
    order to notify the employees and Iterator in order to iterate through the list of employees.
 */

public class Main {
    public static void main(String[] args) {
        ClinicEmployeesFactory factory = new ClinicEmployeesFactory();
        List<Employee> employees = new ArrayList<Employee>();

        String doctor1 = "Eva Johnson";
        String doctor2 = "Blake Carrington";
        String nurse1 = "Adelina Keen";
        String nurse2 = "Thomas Shelby";
        String anesthesiologist1 = "Caroline Forbes";
        String anesthesiologist2 = "Enzo St. John";

        Employee d1 = factory.getEmployee("Doctor", doctor1);
        Employee d2 = factory.getEmployee("Doctor", doctor2);
        Employee n1 = factory.getEmployee("Nurse", nurse1);
        Employee n2 = factory.getEmployee("Nurse", nurse2);
        Employee a1 = factory.getEmployee("Anesthesiologist", anesthesiologist1);
        Employee a2 = factory.getEmployee("Anesthesiologist", anesthesiologist2);


        Collections.addAll(employees, d1, d2, n1, n2, a1, a2);

        Scheduler.scheduleSurgery(employees);
    }
}
