package code._4_student_effort;



    public class FizzBuzz {
        public static void Fi()
        {
            int a;
            int i;
            for(i = 1;i<101;i++)
            {
                a = 0;

                if (i % 3 == 0 && i % 5 == 0)
                {
                    System.out.print("FizzBuzz ");
                    a = 1;
                }

                if (a==0 && i % 3 == 0)
                {
                    System.out.print("Fizz ");
                    a = 1;
                }

                if (a==0 && i % 5 == 0)
                {
                    System.out.print("Buzz ");
                    a = 1;
                }


                if (a == 0)
                    System.out.print(i + " ");


            }



        }

    }

