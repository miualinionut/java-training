package code._4_student_effort.challenge3;

import code._2_challenge._3_proxy.Apartment;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartament> apartaments=new ArrayList<Apartament>();
    void represent(Apartament apartament){
        apartaments.add(apartament);
    }
    Apartament rent(Student student){
        Apartament rented;
        if(student.getName().startsWith("P")==false){
            for(int i=0;i<apartaments.size();i++){
                if(student.getMoney()> apartaments.get(i).getMonthlyRentCost()){
                    rented=apartaments.get(i);
                    apartaments.remove(i);
                    return rented;

                }
            }


        }
        return null;
    }

}
