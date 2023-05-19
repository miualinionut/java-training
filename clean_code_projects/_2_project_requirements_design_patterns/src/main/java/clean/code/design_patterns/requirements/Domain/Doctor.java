package clean.code.design_patterns.requirements.Domain;
import java.util.Objects;

public class Doctor {
    private String firstName;
    private String lastName;
    private String specialization;
    private double salary;

    public Doctor(String firstName, String lastName, String specialization, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(firstName, doctor.firstName) && Objects.equals(lastName, doctor.lastName) && Objects.equals(specialization, doctor.specialization) && Objects.equals(salary, doctor.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, specialization, salary);
    }

    @Override
    public String toString() {
        return "Dr. "  + firstName + ' ' + lastName + ", " + specialization + ", has salary " + salary + "$";
    }
}
