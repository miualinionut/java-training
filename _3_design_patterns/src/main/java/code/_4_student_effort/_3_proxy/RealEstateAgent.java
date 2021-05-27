package code._4_student_effort._3_proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RealEstateAgent {
    List<Apartment> apartments = new ArrayList<>();

    public void represent(Apartment ...apartments) {
        Collections.addAll(this.apartments, apartments);
    }

    public Apartment rent(Student student) {
        for(Apartment apartment:apartments)
            if(apartment.getMonthlyRentCost() <= student.getMoney()) {
                apartments.remove(apartment);
                return apartment;
            }
        return null;
    }
}
