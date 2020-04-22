package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {
        System.out.println(compute(15));
    }

    private static String compute(int x) {
        int ogl = 0, y = x;
        String s1 = "Foo", s2 = "Bar", s3 = "Qix", s = "";
        if (x % 3 == 0)
            s = s.concat(s1);
        if (x % 5 == 0)
            s = s.concat(s2);
        if (x % 7 == 0)
            s = s.concat(s3);
        while (x != 0) {                           //construire oglindit
            ogl = ogl * 10 + x % 10;
            x = x / 10;
        }
        while (ogl != 0) {
            if (ogl % 10 == 3)
                s = s.concat(s1);
            if (ogl % 10 == 5)
                s = s.concat(s2);
            if (ogl % 10 == 7)
                s = s.concat(s3);
            ogl = ogl / 10;
        }
        if (s != "")
            return s;
        else return Integer.toString(y);
    }
}