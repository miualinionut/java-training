package code._4_student_effort;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 100;

        for(int i=1; i<n; i++)
        {
            if(i%15 == 0)
                System.out.print("FizzBuzz ");
            else if(i%21 == 0)
                System.out.print("FizzRizz ");
            else if(i%33 == 0)
                System.out.print("FizzJazz ");
            else if(i%35 == 0)
                System.out.print("BuzzRizz ");
            else if(i%55 == 0)
                System.out.print("BuzzJazz ");
            else if(i%3 == 0)
                System.out.print("Fizz ");
            else if(i%5 == 0)
                System.out.print("Buzz ");
            else if(i%7 == 0)
                System.out.print("Rizz ");
            else if(i%11 == 0)
                System.out.print("Jazz ");
            else
                System.out.print(i +" ");
        }
    }
}
