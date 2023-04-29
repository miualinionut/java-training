package code._3_in_class.singleton;


//sigleton
//ce problema rezolva? cand vrem sa cream 1 singura instanta a unui obiect
//implementare:
//1. definim o variabila statica si privata unde vom stoca instanta cu o valoare initiala null
//2. definim constructor privat pentru a putea fi accesat doar din interiorul clasei
//3. definim o metoda publica getInstance() face return de variabila statica si privata

public class Singleton {
    private static Singleton instance = new Singleton();
   private Singleton(){

   }
   public static Singleton getInstance() {
       return instance;
   }
}

class Main {
    public static void main(String[] args) {

        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();
        Singleton instance03 = Singleton.getInstance();

        System.out.println(instance01.hashCode());
        System.out.println(instance02.hashCode());
        System.out.println(instance03.hashCode());
    }
}
