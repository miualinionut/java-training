/*package code._3_in_class;

public class Main{
    public static void main(String[] args) {
        Student s= new StudentBuilder (10,10,10)
                .setNotaOptionalLimbaJaponeza(5)
                .buid();
        Student sCuConstructor = new Student (10,10,10,10,10);
    }
}

*/




























//import java.sql.SQLOutput;

/*
public class Main {



    public static void main(String[] args) {

        Student s= new Student();

        System.out.println(s.getNotaLaMatematica());
        s.setNotaLaMatematica(-100);

        System.out.println(s.v2);
        s.v2=0;

    }


    public static void main(String[] args) {

        StudentSingleton s1 = new StudentSingleton;
        StudentSingleton s2 = new StudentSingleton;
        StudentSingleton s3 = new StudentSingleton;
System.out.println(s1 == s2); //compara adresa de mamorie
        System.out.println(s1.equals(s2)); //compara valori

        StudentSingleton s1= StudentSingleton.getInstance();
        StudentSingleton s2= StudentSingleton.getInstance();
        Student s3 = StudentSingleton.getInstance();

        StudentBursier s10 = (StudentBursier) makeStudent (nota: 10);
        StudentNormal s = (StudentNormal) makeStudent (nota:7);

    public static IStudent makeStudent (int nota){

        if(nota == 10) {
            return new StudentBursier();
        }
        else {
            if(nota>=5 && nota<10) {
                return new StudentNormal();
            }
            else if (nota >= 1 && nota < 5) {
                    return new StudentRestante();
                }
                else {
                throw new IllegalArgumentException("nota trebuie sa fie intre 1 si 10");
            }
            }
        }
    }

}

*/