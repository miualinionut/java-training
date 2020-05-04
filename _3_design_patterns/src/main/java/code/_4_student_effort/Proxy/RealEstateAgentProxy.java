package code._4_student_effort.Proxy;

import code._4_student_effort.Observer.Observer;

public class RealEstateAgentProxy {
  Apartment[] apart=new Apartment[0];
  int i=0;

    void represent(Apartment apartment)
    {
        increaseSize(apart);
     apart[geTi()]=apartment;
    }

    int geTi()
    {
        return i++;
    }

   Apartment rent(Student student)
    {
        int pret=9999;
        if(student.getName().startsWith("P"))
            return null;
        for(int i=0;i<apart.length;i++)
        {
            if(student.getMoney()>apart[i].getMonthlyRentCost())
                if(apart[i].getMonthlyRentCost()<pret)
                    pret=apart[i].getMonthlyRentCost();
        }
        for(int i=0;i<apart.length;i++)
            if(pret==apart[i].getMonthlyRentCost())
                return apart[i];

            return apart[i];
    }

    public Apartment getApart(int i)
    {
        return apart[i];
    }

    public void increaseSize(Apartment[] apart1) {
        Apartment[] temp = new Apartment[apart1.length + 1];

        for (int i = 0; i < apart1.length; i++){
            temp[i] = apart1[i];
        }
        apart = temp;
    }
}
