package code._4_student_effort.proxy;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartment> apartments = new ArrayList<>();

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        if (student.getFirstLetter() == 'P') {
            // throw new RuntimeException("Student, " + student.getName() + ", is not allowed");
            System.out.println("We refuse to rent apartments to anybody who's name starts with letter \"P\"");
        } else {
            for (Apartment current : apartments) {
                if (current.getMonthlyRentCost() <= student.getMoney() && !current.isRent()) {
                    current.setRent(true);
                    return current;
                }
            }
        }
        return null;
    }
}
