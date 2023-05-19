package code._3_in_class.mutabilitate;

import code._3_in_class.Student;

public class Main {
    public static void main(String[] args) {

        final int i=0; // deoarece i este declarat ca si tip de date int -> int-ul este de tip imutabil
        final Student s= Student.INSTANCE;//este s MUTABIL
        System.out.println(s);
        s.setNume("nu il mai cheama Popescu");
        s.setNotaInformatica(5);
        System.out.println(s);

        //s=Student.INSTANCE;
        String casa="apartament";
        casa="vila"; //aici se creeaza o noua zona de memorie

    }
}
