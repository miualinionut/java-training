package code._4_student_effort.challenge3;

import java.util.ArrayList;

public class RealEstateAgentProxy {

    ArrayList<Apartment> apartments=new ArrayList<>();

    void represent(Apartment apartment){
        apartments.add(apartment);
    }

    Apartment rent(Student student){

        if(!student.getName().trim().startsWith("P")){
            for(Apartment a:apartments) {

                if(a.getMonthlyRentCost()<=student.getMoney()){
                    return a;
                }

            }

        }
        return null;
    }
}
