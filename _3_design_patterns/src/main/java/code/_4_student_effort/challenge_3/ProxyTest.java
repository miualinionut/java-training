package code._4_student_effort.challenge_3;

import code._2_challenge._3_proxy.Apartment;
import code._2_challenge._3_proxy.RealEstateAgentProxy;
import code._2_challenge._3_proxy.Student;

public class ProxyTest {
    public static void main(String[] args) {
        code._2_challenge._3_proxy.Apartment app01 = new code._2_challenge._3_proxy.Apartment("Crangasi01", 300);
        code._2_challenge._3_proxy.Apartment app02 = new code._2_challenge._3_proxy.Apartment("Crangasi01", 600);
        code._2_challenge._3_proxy.Apartment app03 = new code._2_challenge._3_proxy.Apartment("Crangasi01", 350);
        code._2_challenge._3_proxy.Apartment app04 = new code._2_challenge._3_proxy.Apartment("Crangasi01", 400);
        code._2_challenge._3_proxy.Apartment app05 = new code._2_challenge._3_proxy.Apartment("Crangasi01", 200);

        code._2_challenge._3_proxy.RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        code._2_challenge._3_proxy.Student student01 = new code._2_challenge._3_proxy.Student("Ionescu", 500);
        code._2_challenge._3_proxy.Student student02 = new Student("Popescu", 330);

        code._2_challenge._3_proxy.Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

    }

}
