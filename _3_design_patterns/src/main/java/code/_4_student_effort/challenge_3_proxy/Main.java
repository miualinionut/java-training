package code._4_student_effort.challenge_3_proxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("CODE CHALLENGE 3");

        Apartament app01 = new Apartament("Crangasi01", 300);
        Apartament app02 = new Apartament("Crangasi01", 600);
        Apartament app03 = new Apartament("Crangasi01", 350);
        Apartament app04 = new Apartament("Crangasi01", 400);
        Apartament app05 = new Apartament("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);


        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);
        Student student03 = new Student("Gigescu", 630);
        Student student04 = new Student("Copescu", 170);
        Student student05 = new Student("Faunescu", 330);
        Student student06 = new Student("Mijlocescu", 530);
        Student student07 = new Student("Bogatescu", 830);


        Apartament apartamentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartamentForStudent01);

        Apartament apartamentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartamentForStudent02);

        Apartament apartamentForStudent = proxy.rent(student03);
        System.out.println(student03 + " rented " + apartamentForStudent);

        apartamentForStudent = proxy.rent(student04);
        System.out.println(student04 + " rented " + apartamentForStudent);

        apartamentForStudent = proxy.rent(student05);
        System.out.println(student05 + " rented " + apartamentForStudent);

        apartamentForStudent = proxy.rent(student06);
        System.out.println(student06 + " rented " + apartamentForStudent);

        apartamentForStudent = proxy.rent(student07);
        System.out.println(student07 + " rented " + apartamentForStudent);


    }
}
