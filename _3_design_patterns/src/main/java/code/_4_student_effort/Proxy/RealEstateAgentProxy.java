package code._4_student_effort.Proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];


    public void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length-1] = apartment;
    }
    public Apartment rent(Student student){
        Apartment rentedApartment = null;
        if(!student.getName().startsWith("P")) {
            for (int i = 0; i < apartments.length; i++) {
                if (this.apartments[i].getMonthlyRentCost() < student.getMoney()) {
                    rentedApartment = this.apartments[i];

                    int removedApartment = i;
                    System.arraycopy(this.apartments, removedApartment + 1,
                            this.apartments, removedApartment,
                            this.apartments.length - 1 - removedApartment);
                    // asta de mai sus scoate apartamentul care a fost pus la inchiriat
                }
            }
        }
        return rentedApartment;
    }
}
