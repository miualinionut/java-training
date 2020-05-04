package code._4_student_effort;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartaments = new Apartment[0];

    public void represent(Apartment apartament) {

        this.apartaments = Arrays.copyOf(this.apartaments, this.apartaments.length + 1);
        this.apartaments[this.apartaments.length- 1] = apartament;
    }

    public Apartment rent(Student student) {
        Apartment rentedApp = null;
        if (!student.getName().startsWith("P")) {
            for (int i = 0; i < apartaments.length; i++) {
                if (this.apartaments[i].getMonthlyRentCost() < student.getMoney()) {
                    rentedApp = this.apartaments[i];
                    int index = i;
                    System.arraycopy(this.apartaments,index+1,this.apartaments,index,this.apartaments.length-1-index);
                }
            }
        }
        return rentedApp;
    }
}