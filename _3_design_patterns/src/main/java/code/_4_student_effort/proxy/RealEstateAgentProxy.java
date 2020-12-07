package code._4_student_effort.proxy;

public interface RealEstateAgentProxy {
    void represent(Apartment apartment);
    Apartment rent(Student student);
}
