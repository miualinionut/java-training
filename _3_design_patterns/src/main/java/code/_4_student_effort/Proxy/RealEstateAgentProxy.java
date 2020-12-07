package code._4_student_effort.Proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments , this.apartments.length + 1);
        this.apartments[this.apartments.length - 1] = apartment;
    }

    public  Apartment rent(Student student){
        Apartment rentedAp = null;
        if(!student.getName().startsWith("P")){
            for(int i = 0; i < apartments.length;i++)
                if(this.apartments[i].getMonthlyRentCost() < student.getMoney()){
                    rentedAp = this.apartments[i];
                System.arraycopy(this.apartments,i +1,this.apartments,i,this.apartments.length - 1 - i);
                }
        }return rentedAp;
    }
}
