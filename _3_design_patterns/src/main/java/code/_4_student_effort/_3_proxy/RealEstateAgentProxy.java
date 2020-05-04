package code._4_student_effort._3_proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    public Apartment[] appartments = new Apartment[0];

    public void represent(Apartment appartment) {
        this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
        this.appartments[this.appartments.length - 1] = appartment;
    }

    public Apartment rent(Student student) {
        Apartment rented = null;
        if (student.getName().startsWith("P"))
            return null;
        else {
            for (int i = 0; i < appartments.length; i++) {
                if (this.appartments[i].getMonthlyRentCost() < student.getMoney()) {
                    rented = this.appartments[i];
                    int index = i;
                    System.arraycopy(this.appartments, index + 1, this.appartments, index, this.appartments.length - i - 1);
                }
            }
            return rented;
        }
    }
}
