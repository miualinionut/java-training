package code._3_in_class;

public class SecondMain {

    public static void main(String[] args) {
        Student2 s1 = new Student2.Builder()
                .nume("andrei1")
                .build();
        Student2 s2 = new Student2.Builder()
                .nume("andrei2")
                .telefonFix("000")
                .build();
        Student2 s3 = new Student2.Builder()
                .nume("Andrei3")
                .avionPersonal("are")
                .build();
        Student2 s4 = new Student2.Builder()
                .nume("Andrei4")
                .telefonFix("000")
                .avionPersonal("are")
                .build();

    }

}

