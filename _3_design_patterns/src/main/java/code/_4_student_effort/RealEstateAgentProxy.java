package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    private List<Apartment> representedApartments = new ArrayList<>();

    void represent(Apartment apartment) {
        representedApartments.add(apartment);
    }

    Apartment rent(Student student) {
        return representedApartments
                        .stream()
                        .min(
                                // Getting the apartment with the minimum rent cost
                                (apartment1, apartment2) ->
                                Math.min(apartment1.getMonthlyRentCost(), apartment2.getMonthlyRentCost())
                        )
                        .filter(apartment ->
                                // If the apartment meets the next 2 conditions we return it otherwise return null
                                apartment.getMonthlyRentCost() < student.getMoney() &&
                                !student.getName().toLowerCase().startsWith("p")
                        )
                        .orElse(null);
    }
}
