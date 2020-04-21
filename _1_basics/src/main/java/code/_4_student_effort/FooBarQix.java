package code._4_student_effort;

public class FooBarQix {
    public static void compute() {

        for (int n = 1; n < 100; n++) {
            StringBuilder sb = new StringBuilder(" ");
            int cp = n;
            int brk1 = 0, brk2=0;
                if (n % 3 == 0)
                    sb.insert(0, "Foo");
                else if (n % 5 == 0)
                    sb.insert(0, "Bar");
                else if (n % 7 == 0)
                    sb.insert(0, "Qix");
                else brk1++;
            while (cp != 0) {

                if (cp % 10 == 3)
                    sb.insert(0, "Foo");
                else if (cp % 10 == 5)
                    sb.insert(0, "Bar");

                else if (cp % 10 == 7)
                    sb.insert(0, "Qix");
                else brk2++;
                cp = cp / 10;
            }
            if (brk1!=0&&brk2!=0)
                System.out.println(n);
            else
                System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        compute();
    }
}


