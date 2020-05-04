package code._4_student_effort.tema3.Proxy;

import java.util.*;

public class RealEstateAgentProxy {

    Set<Apartment> listApartments = new TreeSet<>(new Comparator<Apartment>() {
        @Override
        public int compare(Apartment ap1, Apartment ap2) {
            return ap1.getMonthlyRentCost() - ap2.getMonthlyRentCost();
        }
    });

    public RealEstateAgentProxy(){
    }

    public void represent(Apartment ap){
        listApartments.add(ap);
    }

    public Apartment rent(Student student){
        if(student.getName().charAt(0) != 'P') {
            for(Apartment ap : listApartments) {
                if(ap.getMonthlyRentCost() < student.getMoney())
                    return ap;
            }
        }
            return null;
    }

}
