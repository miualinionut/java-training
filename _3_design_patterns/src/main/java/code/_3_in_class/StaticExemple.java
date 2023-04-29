package code._3_in_class;

public class StaticExemple {

    static final int altavariabila=0;//keyword final => inseamna ca o data ce o variabila, a fost initializata, nu mai poate fi asignata inca o data
    static int iStatic=0;
    int iInstanta=0;

    public static void main(String[] args){



        StaticExemple instance01=new StaticExemple();
        StaticExemple instance02=new StaticExemple();
        StaticExemple instance03=new StaticExemple();
        instance01.iStatic=1;
        instance02.iInstanta=2;
        instance03.iInstanta=3;

        System.out.println("instance01.iStatic " + instance01.iStatic + " instance01.iInstanta " + instance01.iInstanta);
        System.out.println("instance02.iStatic " + instance02.iStatic + " instance02.iInstanta " + instance02.iInstanta);
        System.out.println("instance03.iStatic " + instance03.iStatic + " instance03.iInstanta " + instance03.iInstanta);
    }
    static void m(){
        System.out.println("metoda statica");
    }
    void m2(){
        System.out.println("metoda instanta");
    }
}
