package code._4_student_effort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] appartments = new Apartment[0];

    public void represent(Apartment appartment) {
        this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
        this.appartments[this.appartments.length - 1] = appartment;
    }
    public Apartment rent(Student student){
        Apartment rentedAppartment = null;
        if(!student.get_name().startsWith("P")){
            for (int i = 0; i < appartments.length; i++) {
                if (this.appartments[i].get_monthlyRentCost() < student.get_money()) {
                    rentedAppartment = this.appartments[i];

                    int removedIndex = i;
                    System.arraycopy(this.appartments, removedIndex + 1, this.appartments, removedIndex, this.appartments.length - 1 - removedIndex);
                }
            }
        }
        return rentedAppartment;
    }
}
