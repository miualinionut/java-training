package code._4_student_effort.challenge3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    List<Apartment> listaApartamente = new ArrayList<Apartment>();

    void represent(Apartment apartment){
        listaApartamente.add(apartment);
    };

    Apartment rent(Student student){

        if(student.name.startsWith("P")){
            return null;
        }

        for(int i = 0; i < listaApartamente.size(); i++){
            if(student.money >= listaApartamente.get(i).monthlyRentCost){
                Apartment apartmentOk = listaApartamente.get(i);
                listaApartamente.remove(i);
                return  apartmentOk;
            }
        };


        return null;
    };

}
