package code._4_student_effort.CodeChallange3;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment) {
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length - 1] = apartment;
    }

    public Apartment rent(Student student){
        Apartment rented = null;
        if(!student.getName().startsWith("P")){
            for (int i = 0; i < apartments.length; i++){
                if(student.getMoney() > apartments[i].getMonthlyRentCost()){
                    rented = apartments[i];
                    System.arraycopy(this.apartments, i + 1, this.apartments, i, this.apartments.length - 1);
                }
            }
        }
        return rented;
    }
}
