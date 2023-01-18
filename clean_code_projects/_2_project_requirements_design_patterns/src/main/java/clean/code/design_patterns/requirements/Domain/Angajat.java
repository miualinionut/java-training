package clean.code.design_patterns.requirements.Domain;

import java.util.Objects;

public class Angajat {
    private String firstName;
    private String lastName;
    private String function;
    private double salary;

    public Angajat(String firstName, String lastName, String function, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.function = function;
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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
        Angajat angajat = (Angajat) o;
        return Objects.equals(firstName, angajat.firstName) && Objects.equals(lastName, angajat.lastName) && Objects.equals(function, angajat.function) && Objects.equals(salary, angajat.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, function, salary);
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", function='" + function + '\'' +
                ", salary=" + salary +
                '}';
    }
}
