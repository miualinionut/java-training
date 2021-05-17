package code._4_student_effort;


import java.util.Scanner;

public class curs1_ch2 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int nr = x;
        if (nr % 3 == 0)
            System.out.println("FOO");
        if (nr % 5 == 0)
            System.out.println("BAR");
        if (nr % 7 == 0)
            System.out.println("QIX");

        while (nr > 0) {
            int var = nr % 10;
            if (var == 0)
                System.out.println(compute2(var));
            nr/=10;
        }
         while(x>0)
            {
                int v=x%10;
                System.out.println(compute(v));

            x /= 10;
            }
        }

    public static String compute(int x) {
       // String a=String.valueOf(x);
        String a="";
        int m3 = 0, m5 = 0, m7 = 0;
        if (x == 3) {
            m3 = 1;
            a = "FOO";
        }
        if (x == 5) {
            m5 = 1;
            a = "BAR";
        }

        if (x == 7) {
            m7 = 1;
            a = "QIX";
        }

        return a;
    }

    public static String compute2(int x) {
        String ste="*";
    while(x>0)
    {
        if(x==0)
        ste="*";
    }
    return ste;
    }
}