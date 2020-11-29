package code._4_student_effort.Challenge2;

public class FooBarQix {

    public static int inverseNumber(int x) {
        int p = 0;
        while (x > 0) {
            p = p * 10 + x % 10;
            x /= 10;
        }
        return p;
    }

    public static String compute(int nr) {
        StringBuilder ans = new StringBuilder();
        if (nr % 3 == 0)
            ans.append("Foo");
        if (nr % 5 == 0)
            ans.append("Bar");
        if (nr % 7 == 0)
            ans.append("Qix");

        nr = inverseNumber(nr);
        while (nr > 0) {
            if (nr % 10 == 3)
                ans.append("Foo");
            else if (nr % 10 == 5)
                ans.append("Bar");
            else if (nr % 10 == 7)
                ans.append("Qix");
            nr /= 10;
        }
        return ans.toString();
    }

    public static String compute2(int nr) {
        StringBuilder ans = new StringBuilder();
        boolean ok = false;
        if (nr % 3 == 0) {
            ans.append("Foo");
            ok = true;
        }
        if (nr % 5 == 0) {
            ans.append("Bar");
            ok = true;
        }
        if (nr % 7 == 0) {
            ans.append("Qix");
            ok = true;
        }

        nr = inverseNumber(nr);

        while (nr > 0) {
            if (nr % 10 == 3) {
                ans.append("Foo");
                ok = true;
            } else if (nr % 10 == 5) {
                ans.append("Bar");
                ok = true;
            } else if (nr % 10 == 7) {
                ans.append("Qix");
                ok = true;
            } else if (nr % 10 == 0)
                ans.append("*");
            else if (!ok)
                ans.append(nr % 10);
            nr /= 10;
        }
        return ans.toString();
    }
}
