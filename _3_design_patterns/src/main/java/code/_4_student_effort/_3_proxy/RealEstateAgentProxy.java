package code._4_student_effort._3_proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length - 1] = apartment;
    }

    public Apartment rent(Student student){
        Apartment rented = null;

        if(!student.getName().startsWith("P")){
            for(int i = 0; i < apartments.length; i++){
                if(this.apartments[i].getMonthlyRentCost() < student.getMoney()){
                    rented = this.apartments[i];

                int removedIndex = i;
                System.arraycopy(this.apartments, removedIndex + 1, this.apartments, removedIndex, this.apartments.length - removedIndex - 1);
                }
            }
        }
        return rented;
    }
}
