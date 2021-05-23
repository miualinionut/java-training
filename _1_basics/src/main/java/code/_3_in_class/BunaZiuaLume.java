package code._3_in_class;

public class BunaZiuaLume {
    public static void main(String[] args) {
        System.out.println("Buna ziua lume");
        System.out.println(true || false); //cand punem cu 2, se opreste verificarea la prima conditie true
        System.out.println(true | false);   //se apeleaza toate conditiile
        System.out.println("-------------------");
        System.out.println(m1()||m2());
        System.out.println("-------------------");
        System.out.println(m1()|m2());
    }
    public static boolean m1(){
        System.out.println("s-a apelat m1");
        return true;
    }
    public static boolean m2(){
        System.out.println("s-a apelat m2");
        return false;
    }
}
