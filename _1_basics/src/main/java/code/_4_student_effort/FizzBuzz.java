package code._4_student_effort;

public class FizzBuzz {
    public FizzBuzz() {}; //default constructor

    //method to be tested in Main
    public void FizzBuzz () {
        for (int i = 1; i <= 100; i++)
        {
            // Stage 1
            if ((i % 3 == 0) && (i % 5 !=0)) //divisible by 3 & not divisible by 5
                System.out.print("Fizz, ");
            else if ((i % 5 == 0) && (i % 3 !=0)) //divisible by 5 & not divisible by 3
                System.out.print("Buzz, ");
            else if (i % 15 == 0) //divisible by 15 <=> div by 3 AND 5
                System.out.println("FizzBUzz ");

            //Stage 2
            else if ((i % 7 == 0) && (i % 11 !=0))
                System.out.print("Rizz, ");
            else if ((i % 11 == 0) && (i % 7 !=0))
                System.out.print("Jazz, ");
            else if (i % 7 == 0 && i % 11 == 0)
                System.out.print("RizzJazz, ");
            else
                System.out.print(i + ", ");
            /*It wasn't specified what happens when the number is divisible by both 7 and 11 (e.g 77 in range 1 - 100)
            so i assumed we should follow the FizzBuzz Pattern */
        }
    }
}
