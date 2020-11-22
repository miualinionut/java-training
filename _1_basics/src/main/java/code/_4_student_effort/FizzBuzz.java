package code._4_student_effort;

public class FizzBuzz {
    public FizzBuzz() {}; //default constructor

    //method to be tested in Main
    public void FizzBuzz () {
        for (int i = 1; i <= 100; i++)
        {
            if ((i % 3 == 0) && (i % 5 != 0) && (i % 7 != 0) && (i % 11 != 0)) //divisible only by 3
                System.out.print("Fizz, ");
            else if ((i % 5 == 0) && (i % 3 != 0) && (i % 7 != 0) && (i % 11 != 0)) //div only by 5
                System.out.print("Buzz, ");
            else if ((i % 7 == 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 11 != 0)) //div only by 7
                System.out.print("Rizz, ");
            else if ((i % 11 == 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 77 != 0)) //div only by 11
                System.out.print("Jazz, ");
            else if ((i % 15 == 0)&& (i % 7 != 0) && (i % 11 != 0)) //div only by 3 AND 5
                System.out.println("FizzBuzz, ");
            else if ((i % 21 == 0)&& (i % 5 != 0) && (i % 11 != 0)) //div only by 3 AND 7
                System.out.println("FizzRizz, ");
            else if ((i % 33 == 0)&& (i % 5 != 0) && (i % 7 != 0)) //div only by 3 AND 11
                System.out.println("FizzJazz, ");
            else if ((i % 35 == 0)&& (i % 3 != 0) && (i % 11 != 0)) //div only by 5 AND 7
                System.out.println("BuzzRizz, ");
            else if ((i % 55 == 0)&& (i % 3 != 0) && (i % 7 != 0)) //div only by 5 AND 11
                System.out.println("BuzzJazz, ");
            else if ((i % 77 == 0)&& (i % 3 != 0) && (i % 5 != 0)) //div only by 7 AND 11
                System.out.println("RizzJazz, ");
            else
                System.out.print(i + ", "); //default case
        }
    }
}
