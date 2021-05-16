package code._4_student_effort;

import java.util.Scanner;

public class CodeChallenge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[4];
        for(int i=0;i<3;i++) {
            x[i] = scan.nextInt();
            System.out.println(compute(x[i]));
            System.out.println(compute2(x[i]));
        }

    }

    private static String compute(int a) {
        String cuv = "";
        String num = Integer.toString(a);
        boolean x = false;

        if (a % 3 == 0) {
            x = true;
            cuv += "Foo";
        }
        if (a % 5 == 0) {
            x = true;
            cuv += "Bar";
        }
        if (a % 7 == 0) {
            x = true;
            cuv += "Qix";
        }

            for(int i = 0; i<num.length();i++)
            {
                if((Integer.parseInt("" + num.charAt(i))  == 3))
                {
                    cuv += "Foo";
                }
            }
        for(int i = 0; i<num.length();i++)
        {
            if((Integer.parseInt("" + num.charAt(i))  == 5))
            {
                cuv += "Foo";
            }
        }
        for(int i = 0; i<num.length();i++)
        {
            if((Integer.parseInt("" + num.charAt(i))  == 7))
            {
                cuv += "Foo";
            }
        }

        if(!x)
        {
            cuv += Integer.toString(a);
        }

        return cuv;

    }
    private static String compute2(int a)
    {
        String num = Integer.toString(a);
        String cuv = "";
        boolean x = false;

        if (a % 3 == 0) {
            x = true;
            cuv += "Foo";
        }
        if (a % 5 == 0) {
            x = true;
            cuv += "Bar";
        }
        if (a % 7 == 0) {
            x = true;
            cuv += "Qix";
        }

        for(int i = 0; i<num.length();i++)
        {
            if((Integer.parseInt("" + num.charAt(i))  == 3))
            {
                x = true;
                cuv += "Foo";
            }
        }
        for(int i = 0; i<num.length();i++)
        {
            if((Integer.parseInt("" + num.charAt(i))  == 5))
            {
                x = true;
                cuv += "Foo";
            }
        }
        for(int i = 0; i<num.length();i++)
        {
            if((Integer.parseInt("" + num.charAt(i))  == 7))
            {
                x = true;
                cuv += "Foo";
            }
        }
   for(int i = 0; i<num.length();i++)
   {
       if((Integer.parseInt("" + num.charAt(i))  == 0)) {
           x = true;
           cuv += "*";
       }else {
           cuv += num.charAt(i);
       }
   }
        return cuv;

    }


}
