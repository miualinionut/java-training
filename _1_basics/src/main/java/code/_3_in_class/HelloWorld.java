package code._3_in_class;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world 2");
        int i = 10;
        System.out.println(i++); //10 -> mai intai afiseaza, apoi incrementeaza
        System.out.println(i); //11
        System.out.println(++i); //12 -> incrementeaza, apoi afiseaza

        System.out.println("Numerele pare: ");
        for(i=0; i<100; i+=2){
            System.out.println(i);
        }
    }
}
