package code._4_student_effort.challenge_3;

public class ProxyTest {
    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi1", 300);
        Apartment app02 = new Apartment("Crangasi1", 600);
        Apartment app03 = new Apartment("Crangasi1", 350);
        Apartment app04 = new Apartment("Crangasi1", 400);
        Apartment app05 = new Apartment("Crangasi1", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);
    }
}
