package code._4_student_effort.challenge3;


public class Main {
    public static void main(String[] args) {
        Apartament app01 = new Apartament("Crangasi01", 300);
        Apartament app02 = new Apartament("Crangasi01", 600);
        Apartament app03 = new Apartament("Crangasi01", 350);
        Apartament app04 = new Apartament("Crangasi01", 400);
        Apartament app05 = new Apartament("Crangasi01", 200);

        RealEstateAgentProxy Proxy = new RealEstateAgentProxy();
        Proxy.represent(app01);
        Proxy.represent(app02);
        Proxy.represent(app03);
        Proxy.represent(app04);
        Proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartament apartmentForStudent01 = Proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartament apartmentForStudent02 = Proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);
    }
}
