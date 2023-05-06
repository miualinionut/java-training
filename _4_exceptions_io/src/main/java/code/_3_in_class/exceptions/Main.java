package code._3_in_class.exceptions;

public class Main {
    public static void main(String[] args) {


        IStudent student =metoda3();
        System.out.println(student.hello());

    }

    static IStudent metoda3(){
        try{  //liniile astea de cod trebuie sa se execute in cazul in care codul merge- nu avem exceptii
            return metoda2();
        }catch (Exception e){
            //liniile astea de cod trebuie sa se execute in cazul in care codul nu merge- avem exceptii
            return new StudentGenZ("la scoala");
        }finally{ //se executa intotdeauna, insemanand INTOTDEAUNA SI MEREU
            System.out.println("do something");
        }
    }
    static IStudent metoda2(){

        return StudentFactory.valueof(3000, "Stanford");
    }


}


