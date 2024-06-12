package code._3_in_class;

import java.util.Random;

public class Boxer {

    String nume;
    int sanatate;
    int daunePerLovitura;

    public Boxer(String nume, int sanatate, int daunePerLovitura) {
        this.nume = nume;
        this.sanatate = sanatate;
        this.daunePerLovitura = daunePerLovitura;
    }

    void ataca(Boxer adversar){

        int dauneDate = (100 - adversar.defend()) * this.daunePerLovitura / 100;
        adversar.sanatate-= dauneDate;

        System.out.println(this.nume + " l-a atacat pe "+ adversar.nume +
                ", dand " + dauneDate + " daune");
    }

    int defend(){
        Random random = new Random();
        int procentajAparare = random.nextInt(101);

        return procentajAparare;
    }
}
