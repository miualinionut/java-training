package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Proxy {
    List<Apartament> a;
    Proxy(){
        a=new ArrayList<>();
    }
    void represent(Apartament apartament){
        a.add(apartament);
    }
    Apartament rent(Student student){
        if(student.isP()==true)return null;
        int min=9999,poz=-1;
        for (int i = 0; i < a.size(); i++) {
            if(min>a.get(i).getMonthlyRentCost()){
                poz=i;
                min=a.get(i).getMonthlyRentCost();
            }
        }
        if (poz==-1)return null;
        return a.get(poz);
    }
}
