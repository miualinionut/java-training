package code._3_in_class;

import javax.management.InstanceAlreadyExistsException;

public class Singleton {
    static int nrinstante = 0;
    static Singleton INSTANCE = null;

    private Singleton() {
        this.nrinstante = this.nrinstante + 1;
        System.out.println("s-a apelat constructorul " + this.nrinstante + " ori");
    }

    public static Singleton getInstance() {
        if (nrinstante == 0) {
            return INSTANCE = new Singleton();
        } else {
            return INSTANCE;
        }
    }


}
