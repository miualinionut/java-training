package code._4_student_effort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByPrice implements Comparator<Apartment> {
    @Override
    public int compare(Apartment apartment, Apartment t1) {
        return apartment.getMonthlyRentCost() - t1.getMonthlyRentCost();
    }
}

public class RealEstateAgentProxy implements RealEstateAgent {

    private RealEstateAgent agent;
    private ArrayList<Apartment> apartments;

    public RealEstateAgentProxy() {
//        this.agent = agent;
        apartments = new ArrayList<>();
    }

    @Override
    public void represent(Apartment apartment) {
        this.apartments.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {
        if (!student.nameWithoutP()) {
            Collections.min(apartments, new SortByPrice());
            if (student.getMoney() < apartments.get(0).getMonthlyRentCost()) {
                return null;
            }
            for (int i = 0; i < apartments.size(); ++i) {
                if (student.getMoney() < apartments.get(i).getMonthlyRentCost()) {
                    return apartments.get(i - 1);
                }
            }
            return apartments.get(apartments.size() - 1);
        }

        return null;
    }
}
