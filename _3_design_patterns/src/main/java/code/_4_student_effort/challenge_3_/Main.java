package code._4_student_effort.challenge_3_;

import java.util.prefs.AbstractPreferences;

public class Main {
    public static void main(String[] args) {
        Apartment[] apartments = new Apartment[]{new Apartment("Crangasi01", 300),
                                                 new Apartment("Crangasi01", 600),
                                                 new Apartment("Crangasi01", 350),
                                                 new Apartment("Crangasi01", 400),
                                                 new Apartment("Crangasi01", 200)};

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();

        for(Apartment iterator:apartments) {
            proxy.represent(iterator);
        }

        Student[] students = new Student[]{new Student("Ionescu", 500), new Student("Popescu", 330)};
        Apartment[] apartmentsForStudents = new Apartment[students.length];

        for(int i = 0; i < students.length; i++) {
            apartmentsForStudents[i] = proxy.rent(students[i]);
        }

        for(int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.print(" rented ");

            if(apartmentsForStudents[i] != null) {
                apartmentsForStudents[i].display();
            } else {
                System.out.print("null");
            }

            System.out.println();
        }
    }
}
