package code._4_student_effort.Proxy;

public class Client {
    public static void main(String[] args) {
        Apartment ap1 = new Apartment("Strada1", 400);
        Student st1 = new Student("Ionescu", 500);
        RealEstateAgentProxy proxy = new RealEstateAgentProxy();

        proxy.represent(ap1, st1);
        proxy.rent(st1);






    }
}
