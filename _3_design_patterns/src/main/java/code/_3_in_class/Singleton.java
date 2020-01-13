package code._3_in_class;

public class Singleton {
    public static int nrInstante = 0;
    static Singleton INSTANCE = null;
    private Singleton(){
        this.nrInstante ++;
        System.out.println("s-a apelat constructorul de " + nrInstante +" ori");
    }
    public static Singleton getInstance(){
        if (nrInstante == 0) {
            return INSTANCE = new Singleton();
        }  else {
            return INSTANCE;
        }
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
