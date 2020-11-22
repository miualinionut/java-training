package code._4_student_effort;

public class FooBarQix {
    static String outStr = null;
    static boolean gasit = false;

    static String compute2(int nr)
    {

    }
    static String compute(int nr)
    {
        if(outStr == null) {
            outStr = "";
            if (nr % 3 == 0) {
                outStr = "Foo";
                gasit = true;
            }
            if (nr % 5 == 0) {
                outStr = outStr + "Bar";
                gasit = true;
            }
            if (nr % 7 == 0) {
                outStr = outStr + "Qix";
                gasit = true;
            }
        }
        if(nr != 0)
        {
            compute(nr / 10);
            int digit = nr % 10;
            switch (digit)
            {
                case 3: outStr += "Foo"; gasit = true; break;
                case 5: outStr += "Bar"; gasit = true; break;
                case 7: outStr += "Qix"; gasit = true; break;
            }
        }
        if(!gasit)
        {
            return "" + nr;
        }
        return outStr;
    }

    public static void main(String[] args)
    {
        int nr = 51;
        System.out.print(compute(nr));
    }
}
