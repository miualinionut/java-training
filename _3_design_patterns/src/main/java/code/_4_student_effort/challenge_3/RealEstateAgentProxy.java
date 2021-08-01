package code._4_student_effort.challenge_3;

import java.util.Arrays;

public class RealEstateAgentProxy {

    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment a){
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length -1] = a;

    }

    public Apartment rent(Student student){

        Apartment rentedApartment = null;
        char firstLetter = student.getName().toCharArray()[0];
        if(firstLetter != 'P') return null;
        else {
            for(int i = 0; i < this.apartments.length; i++)
                if(apartments[i].getMonthlyRentCost() < student.getMoney()) {

                    rentedApartment = apartments[i];
                    int removedIndex = i;
                    System.arraycopy(this.apartments, removedIndex + 1, this.apartments, removedIndex, this.apartments.length - 1 - removedIndex);

                }
        }
        return rentedApartment;
    }
}
