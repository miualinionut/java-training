package code._3_in_class;

public class RandomClass implements Interface01, Interface02
{
    public static void main(String[] args){
        RandomClass c= new RandomClass();
        c.m();
    }
    public void m(){
        Interface02.super.m();
    }
}
