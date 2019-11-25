package code._3_in_class;

class Singleton {

    private static int nrInstante = 0;
    private static Singleton INSTANCE = null;
    private Singleton(){
        nrInstante++;
        System.out.println("s-a apelat constructorulde "+ nrInstante + " ori");
    }
    static Singleton getInstance(){
        if(nrInstante == 0 ){
            return INSTANCE = new Singleton();
        } else {
            return INSTANCE;
        }
    }
}
