package code._3_in_class;

public class Delegare {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m1();

        Mostenire mosterire = new Mostenire();
        mosterire.m1();

        Delegare2 delegare = new Delegare2();
        delegare.m1();
    }
}
class C1{
    void m1(){
        System.out.println("C1 m1()");
    }
}

class Mostenire extends C1{

}

class Delegare2 {
    C1 c1 = new C1();
    void m1(){
        this.c1.m1();
    }
}