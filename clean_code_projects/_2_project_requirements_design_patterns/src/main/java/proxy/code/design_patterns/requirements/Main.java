package proxy.code.design_patterns.requirements;

public class Main {
    public static void main(String[] args) {
        Cars c1=new Cars("Audi","A6",2019,20000,200,800);
        Cars c2=new Cars("Ford","Focus",2008,180000,120,100);
        Cars c3=new Cars("BMW","M5",2011,80000,300,1000);
        Cars c4=new Cars("Toyota","Yaris",2008,200000,90,70);
        Cars c5=new Cars("Renault","Megane",2015,45000,100,150);
        Cars c6=new Cars("Skoda","Octavia",2008,170000,130,120);


        Agency agency= new Agency();
        agency.details(c1);
        agency.details(c2);
        agency.details(c3);
        agency.details(c4);
        agency.details(c5);
        agency.details(c6);

        Customer customer1=new Customer("Popescu Ion",26,1920304017,5);

        System.out.println(customer1);
    }




}
