package code._4_student_effort.Proxy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RealEstateAgentProxy {
    Apartment[] apartments = new Apartment[0];
    int numberOfApartments=0;
    public void represent(Apartment apartment){
        apartments = Arrays.copyOf(apartments, numberOfApartments+1);
        apartments[numberOfApartments++]=apartment;
    }
    public Apartment rent(Student student){
        if (student.name.toLowerCase().charAt(0)!='p'){
            for (int i=0; i<numberOfApartments; i++)
                if (apartments[i].monthlyRentCost<=student.money) {
                    System.arraycopy(apartments, i+1, apartments, i, numberOfApartments-i-1);
                    return apartments[i];
                }
        }
        return null;
    }
}
