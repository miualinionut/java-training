package code._3_in_class.polimorfism;

public class PolimorfismStaticSauLaCompilare {

    public static void main(String[] args) {

     //modul de scriere cod iperativ in care scrieti instructiuni una sub alta si ele se vor executa in ordine

     int sum =getSum(1,2);
     System.out.println(sum);

     int sum2=getSum(3,4);
        System.out.println(sum2);

     PolimorfismStaticSauLaCompilare instance=new PolimorfismStaticSauLaCompilare();
     instance.m(1,2);


    }
    private static int getSum(int valA, int valB){
        int a=valA;
        int b=valB;
        int sum=a+b;
        return sum;
    }
    void m(int i){
        System.out.println("metoda m cu implementarea 01");
    }
    void m(float i){
        System.out.println("metoda m cu implementarea 02");
    }
    void m(int i, int j){
        System.out.println("metoda m cu implementarea 03");
    }
}
