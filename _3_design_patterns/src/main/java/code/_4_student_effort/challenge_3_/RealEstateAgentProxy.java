package code._4_student_effort.challenge_3_;

public class RealEstateAgentProxy {
    private Apartment[] apartments;
    private boolean[] isRented;

    public void represent(Apartment apartment) {
        if(apartments == null) {
            apartments = new Apartment[1];
            isRented = new boolean[1];
            apartments[0] = apartment;
        } else {
            Apartment[] temp = new Apartment[apartments.length + 1];
            isRented = new boolean[apartments.length + 1];

            for (int i = 0; i < apartments.length; i++) {
                temp[i] = apartments[i];
            }

            temp[apartments.length] = apartment;
            apartments = temp;
        }
    }

    public Apartment rent(Student student) {
        if (!student.getName().startsWith("P")) {
            int minimumRent = apartments[0].getRent();
            int minimumIndex = 0;

            for(int i = 0; i < apartments.length; i++) {
                int rent = apartments[i].getRent();

                if(rent < minimumRent && !isRented[i]) {
                    minimumRent = rent;
                    minimumIndex = i;
                }
            }

            isRented[minimumIndex] = true;

            return apartments[minimumIndex];
        }

        return null;
    }
}
