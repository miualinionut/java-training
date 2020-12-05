package code._4_student_effort.Challenge3;

public class RealEstateAgentProxy {
    Apartment ap;
    public void represent(Apartment apartment) {
        ap = apartment;
    }

    public Apartment rent (Student student){
        if (student.name.charAt(0) == 'P') {
            return null;
        }
        return ap;
    }
}
