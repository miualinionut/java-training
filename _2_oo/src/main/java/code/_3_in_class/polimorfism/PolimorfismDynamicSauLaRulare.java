package code._3_in_class.polimorfism;

public class PolimorfismDynamicSauLaRulare {

    public static void main(String[] args) {

        Copil c = new Copil();
        c.m(1);
    }
}

class Parinte{
    void m(int i){
        System.out.println("metoda m cu implementarea 01");
    }
}

class Copil extends Parinte{
    void m(int i){
        System.out.println("metoda m cu implementarea 02");
    }
}
