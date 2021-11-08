public class Code_Challenge_1 {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 100; i++)
        {
            if(i % 3 == 0)
            {
                if(i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if(i % 7 == 0)
                    System.out.println("FizzRizz");
                else if(i % 11 == 0)
                    System.out.println("FizzJazz");
                else
                    System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                if(i % 7 == 0)
                    System.out.println("BuzzRizz");
                else if(i % 11 == 0)
                    System.out.println("BuzzJazz");
                else
                    System.out.println("Buzz");
            }
            else if(i % 7 ==0)
                if(i % 11 == 0)
                    System.out.println("RizJazz");
                else
                    System.out.println("Rizz");
             else if(i % 11 == 0)
                 System.out.println("Jazz");
             else
                 System.out.println(i);

        }
    }
}
