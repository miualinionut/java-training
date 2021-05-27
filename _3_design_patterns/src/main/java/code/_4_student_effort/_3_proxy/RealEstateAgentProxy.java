package code._4_student_effort._3_proxy;

public class RealEstateAgentProxy extends RealEstateAgent{
    @Override
    public Apartment rent(Student student) {
        if(!student.getName().startsWith("P"))
            return super.rent(student);
        return null;
    }
}
