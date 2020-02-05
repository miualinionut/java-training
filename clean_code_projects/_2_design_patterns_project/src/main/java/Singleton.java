public class Singleton {
    public static Singleton obj = null;
    public String s;

    private Singleton(){
        s = "Buna! Eu sunt clasa Singleton!";
    }
    public static Singleton getInstance(){
        if (obj == null)
            obj = new Singleton();
        return obj;
    }

}
