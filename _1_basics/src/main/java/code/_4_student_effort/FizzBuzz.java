package code._4_student_effort;

import java.util.*;

public class FizzBuzz {

    public static void fizzBuzz(){
        for(int i=0;i<=100;i++){
             if(i%5==0){
                if(i%3==0) {
                    System.out.println("FizzBuzz");
                }
                else if(i%7==0){
                    System.out.println("RizzBuzz");
                }
                else if(i%11==0){
                    System.out.println("RizzJazz");
                }
                System.out.println("Buzz");
            }
            else if(i%3==0){
                 if(i%7==0){
                     System.out.println("FizzRizz");
                 }
                 else if(i%11==0){
                     System.out.println("FizzJazz");
                 }
                System.out.println("Fizz");
            }
             else if(i%7==0){
                 if(i%11==0){
                     System.out.println("RizzJazz");
                 }
                 System.out.println("Rizz");
             }
             else if(i%11==0){
                 System.out.println("Jazz");
             }
            else
                System.out.println(i);
        }
    }

    public static String compute(int x ){

        String toBeReturned = "";
        if(x % 3 == 0 || x % 5 == 0 || x % 7 == 0) {
            if (x % 3 == 0) {
                toBeReturned = toBeReturned + "Foo";
            }
            if (x % 5 == 0) {
                toBeReturned = toBeReturned + "Bar";
            }
            if (x % 7 == 0) {
                toBeReturned = toBeReturned + "Qix";
            }

        }
        else toBeReturned = String.valueOf(x);

        toBeReturned = toBeReturned + getContains(x);

        return toBeReturned;
    }

    public static String getContains(int x){

        String toBeAdded="";

        while(x>0){
            if(x%10==3){
                toBeAdded=toBeAdded+"Foo";
            }
            else  if(x%10==5){
                toBeAdded=toBeAdded+"Bar";
            }
            if(x%10==7){
                toBeAdded=toBeAdded+"Qiz";
            }
            x=x/10;
        }
        return toBeAdded;
    }

    public static void toShow(int n){

        System.out.println(compute(n));
    }

    public static String compute2(int x){
    String toCheck = String.valueOf(x);

    int counter=0;
    String toBeReturned = compute(x);
    for(int i=0;i< toCheck.length();i++)
    {
        if(toCheck.charAt(i) == '0')
            counter++;
    }

    while(counter>0){
        toBeReturned = toBeReturned+"*";
        counter--;
    }
    return compute(x)+toBeReturned;
    }

    public static int pairsOf2 (){

        Scanner scanner = new Scanner(System.in);
        String str;
        List<Integer> lista = new ArrayList<>();
            while(scanner.hasNextInt())
            {
                lista.add(scanner.nextInt());
            }
//System.out.println(lista);
        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<lista.size();i++){
            map.put(lista.get(i),0);
        }
        System.out.println(map);

            int counter =0;

        for(Map.Entry<Integer,Integer> mapEntry : map.entrySet() ){

        }

return 2;
    }
}
