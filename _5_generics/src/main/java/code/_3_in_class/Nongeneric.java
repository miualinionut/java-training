package code._3_in_class;

public class Nongeneric {
    Object ob;

    public Nongeneric(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Type is: "+ ob.getClass().getName());
    }

    public static void main(String[] args) {
        Nongeneric obj1=new Nongeneric(88);
        obj1.showType();

        int value=(Integer) obj1.getOb();

        Nongeneric obj2=new Nongeneric("cevva");
        obj2.showType();
    }
}
