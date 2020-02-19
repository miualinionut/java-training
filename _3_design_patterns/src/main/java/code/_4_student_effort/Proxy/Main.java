package code._4_student_effort.Proxy;

public class Main {
    public static void main(String[] args) {

        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi02", 600);
        Apartment app03 = new Apartment("Crangasi03", 350);
        Apartment app04 = new Apartment("Crangasi04", 400);
        Apartment app05 = new Apartment("Crangasi05", 200);

//        float x = 3.5f;
//        double y = 1.2;
//        y = x;
//        System.out.println(y);

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
