package code._4_student_effort.Proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment apartment;
    private Student student;

    public void represent(Apartment appartment, Student student) {
        this.apartment = appartment;
        this.student = student;
    }

    public Apartment rent(Student student) {
        if (this.student.getName().substring(0, 1) == "P" || this.apartment.getRentCost() > this.student.getMoney()) {
            System.out.println("This appartament can't be rented!");
        }System.out.println(this.apartment + " was rented by student: " + this.student);
        return this.apartment;
    }
}
