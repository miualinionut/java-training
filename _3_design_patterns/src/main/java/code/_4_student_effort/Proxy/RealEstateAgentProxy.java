package code._4_student_effort.Proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments ={};
    public void represent (Apartment apartment){

       apartments =  Arrays.copyOf(apartments, apartments.length+1);
       apartments[apartments.length-1]= apartment;

    }

    public Apartment rent(Student student){
        Apartment rented = null;
        if(!student.getName().startsWith("P")) {
            for (int i = 0; i <= apartments.length-1; i++) {
                if (apartments[i].getMonthlyRentCost() < student.getMoney()) {
                    rented = apartments[i];
                    System.arraycopy(apartments, i + 1, apartments, i, apartments.length - i - 1);
                }
            }
        }
       return rented;
        }

    }


