package code._3_in_class;

import java.security.spec.RSAOtherPrimeInfo;

public class Singleton {
    static int  nrInstante = 0;
    static Singleton INSTANCE = null;
    private Singleton(){
        this.nrInstante = this.nrInstante + 1;
        System.out.println("s-a apelat constructorul de " + this.nrInstante + " ori");
    }
    public static Singleton getInstante(){

        if(nrInstante == 0)
            return INSTANCE = new Singleton();
        else
            return INSTANCE;
    }
}

