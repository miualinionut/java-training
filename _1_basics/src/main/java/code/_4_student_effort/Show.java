package code._4_student_effort;

public class Show {
    public static void main(String[] args) {
       Information person = new Builder("Alex")
               .setJob("Developer")
               .setDrivingLicense(true)
               .setIsMarried(false)
               .build();
        System.out.println(person.getJob());
    }

}