package code._4_student_effort.challenge_3;

public class RealEstateAgentProxy {
    private Apartment apartment;

    void represent(Apartment apartment) {
        this.apartment = apartment;
    }

    Apartment rent(Student student) {
        if (student.getName().charAt(0) == 'P' || student.getMoney() < apartment.getMonthlyRentCost())
            return null;
        return apartment;
    }
}
