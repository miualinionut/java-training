package code._4_student_effort;

public class FooBarQix {
    public String compute(int i) {
        String s = "";

        int x = i;
        while (x != 0) {
            if (x % 10 == 3) s = "Foo" + s;
            if (x % 10 == 5) s = "Bar" + s;
            if (x % 10 == 7) s = "Qix" + s;
            x /= 10;
        }
        if (i % 7 == 0) s = "Qix" + s;
        if (i % 5 == 0) s = "Bar" + s;
        if (i % 3 == 0) s = "Foo" + s;

        if (s.equals(""))
            s = String.valueOf(i);
        return s;
    }

    public String compute2(int i) {
        String s = "";

        int x = i;
        while (x != 0) {
            if (x % 10 == 0) s = "*" + s;
            if (x % 10 == 3) s = "Foo" + s;
            if (x % 10 == 5) s = "Bar" + s;
            if (x % 10 == 7) s = "Qix" + s;
            x /= 10;
        }
        if (i % 7 == 0) s = "Qix" + s;
        if (i % 5 == 0) s = "Bar" + s;
        if (i % 3 == 0) s = "Foo" + s;

        if (s.equals(""))
            s = String.valueOf(i);
        if (s.equals("*")) {
            s = "";
            x = i;
            while (x != 0) {
                if (x % 10 == 0)
                    s = "*" + s;
                else
                    s = String.valueOf(x % 10) + s;
                x /= 10;
            }
        }
        return s;
    }
}