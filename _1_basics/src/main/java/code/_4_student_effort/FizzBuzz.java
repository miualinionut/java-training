package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {

        /*int i = 1;
        for(i = 1; i<=100; i++) {
          if(i%3==0 && i%5==0 )
                System.out.println("fizzBuzz");
          else if(i%3==0 && i%5!=0)
                System.out.println("fizz");
           else if(i%5==0 && i%3!=0)
                System.out.println("buzz");

else System.out.println(i);*/

        int i = 1;
        for(i = 1; i<=100; i++) {
            if(i%3==0 && i%5==0 && i%7==0 && i%11==0)
            {System.out.println("FizzBuzzRizzJazz");} //Nu exista numar <=100 cu aceasta prop

            else if(i%3==0 && i%5==0 && i%7==0) {
                System.out.println("FizzRizzJazz");  //Nu exista numar <=100 cu aceasta prop
            }

            else if(i%3==0 && i%5==0 && i%11==0){
                System.out.println("FizzBuzzJazz");  //Nu exista numar <=100 cu aceasta prop
            }

            else if(i%3==0 && i%7==0 && i%11==0){
                System.out.println("FizzRizzJazz");  //Nu exista numar <=100 cu aceasta prop
            }

            else if(i%5==0 && i%7==0 && i%11==0){
                System.out.println("BuzzRizzJazz");  //Nu exista numar <=100 cu aceasta prop
            }
            else if(i%3==0 && i%5==0 )  {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0 && i%7==0 )  {
                System.out.println("FizzRizz");
            }
            else if(i%3==0 && i%11==0 )  {
                System.out.println("FizzJazz");
            }
            else if(i%5==0 && i%7==0 )  {
                System.out.println("BuzzRizz");
            }
            else if(i%5==0 && i%11==0 )  {
                System.out.println("BuzzJazz");
            }
            else if(i%7==0 && i%11==0 )  {
                System.out.println("RizzJazz");
            }
            else if(i%3==0)  {
                System.out.println("Fizz");
            }
            else if(i%5==0)  {
                System.out.println("Buzz");
            }
            else if(i%7==0)  {
                System.out.println("Rizz");
            }
            else if(i%11==0)  {
                System.out.println("Jazz");
            }



            else System.out.println(i);

        }
        }}