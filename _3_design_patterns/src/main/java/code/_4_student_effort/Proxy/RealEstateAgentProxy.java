package code._4_student_effort.Proxy;

import java.util.ArrayList;

public class RealEstateAgentProxy implements IRealEstateAgent{
    private ArrayList<Apartament> apartaments = new ArrayList<>();

    @Override
    public void represent(Apartament apartament) {
        apartaments.add(apartament);
    }

    @Override
    public Apartament rent(Student student) {
        Apartament rentedApartment = null;
        if (!student.nameStudent.startsWith("P")){
            for (Apartament apartment :
                    apartaments) {
                if (apartment.monthlyRentCost < student.money){
                    rentedApartment = apartment;
                    apartaments.remove(apartment);
                    return rentedApartment;
                }
            }
        }
        return rentedApartment;
    }
}
