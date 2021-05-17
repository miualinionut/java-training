package code._4_student_effort;

public class curs1_ch1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            multip(i);
        }
    }

    public static void multip(int x) {
        int m3 = 0, m5 = 0, ok = 0;

        if (x % 3 == 0) {
            //System.out.println("Fizz");
            m3 = 1;
            ok = 1;
        }
        if (x % 5 == 0) {
            //System.out.println("Buzz");
            m5 = 1;
            ok = 1;

        }
        if ((m3 == 1) && (m5 == 1)) {
            System.out.println("FizzBuzz");
        }
        if(m3==1 && m5==0)
            System.out.println("Fizz");
        if(m5==1 && m3==0)
            System.out.println("Buzz");
        if(x%7==0 && ok==0)
            System.out.println("Rizz");
        if(ok == 0)
            System.out.println(x);
    }
}