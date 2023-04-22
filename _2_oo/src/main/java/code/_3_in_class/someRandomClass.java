package code._3_in_class;

public class someRandomClass implements interface01, interface02{
    public static void main(){
        someRandomClass c= new someRandomClass();
        c.m();
    }

    @Override
    public void m(){
        interface02.super.m();
    }
}
