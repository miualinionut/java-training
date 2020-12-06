package code._4_student_effort.challenge_3_proxy;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartament> apartamentList;

    public RealEstateAgentProxy() {
        apartamentList = new ArrayList<>();
    }

    void represent(Apartament apartament){
        apartamentList.add(apartament);
    }

    Apartament rent(Student student){
        Apartament toRent = null;
        for(Apartament apartament : apartamentList){
            if(!apartament.isRented)
                if(!student.name.trim().startsWith("P") && student.money > apartament.monthlyRentCost) {
                    toRent = apartament;
                    apartament.isRented = true;
                    break;
                }
        }
        return toRent;
    }


}
