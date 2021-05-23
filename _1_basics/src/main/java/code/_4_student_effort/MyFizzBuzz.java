package code._4_student_effort;


public class MyFizzBuzz {
    public static void fizzBuzz1(){
        System.out.println("Method fizzBuzz1:");
        for(int i=1;i<=100;i++){
            if(i%15==0)
                System.out.print("FizzBuzz ");
            else if(i%5==0)
                System.out.print("Buzz ");
            else if(i%3==0)
                System.out.print("Fizz ");
            else
                System.out.print(i+" ");
        }

        System.out.println();

    }

    public static void fizzBuzz2(){
        System.out.println("Method fizzBuzz2:");
        for(int i=1;i<=100;i++){
            if(i%15==0)
                System.out.print("FizzBuzz ");
            else if (i%11==0)
                System.out.print("Jazz ");
            else if (i%7==0)
                System.out.print("Rizz ");
            else if(i%5==0)
                System.out.print("Buzz ");
            else if(i%3==0)
                System.out.print("Fizz ");
            else
                System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        fizzBuzz1();
        fizzBuzz2();


    }

}
