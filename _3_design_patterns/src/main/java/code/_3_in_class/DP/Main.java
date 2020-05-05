package code._3_in_class.DP;

public class Main {
    public static void main(String[] args) {
        StudentSingleton s1 = StudentSingleton.getInstance();
        StudentSingleton s2 = StudentSingleton.getInstance();

        //instantiere = new + nume_constructor
    }
}
//paradigma = un mod de a face lucrurile
//oop = o paradigma
//problema: in paradigma oop vreau sa limitez instantierea unei clase la 1 singura instanta
//context: oop
//solutie: ?? - singleton - dp doar pt o singura instanta
 class StudentSingleton {
    private String nume;

    private StudentSingleton(String nume){
        this.nume = nume;
    }

    private static StudentSingleton instance = new StudentSingleton("ion"); //implementare eager si thread safe

    //cum fac sa fie lazy si thread safe


    public static StudentSingleton getInstance(){
            return instance;
    }

    public void sxhimbaNume(String nume){
        StudentSingleton.instance.nume= nume;
    }

    public void sayHello(){
        System.out.println(this.nume + " Hello");
    }
}
