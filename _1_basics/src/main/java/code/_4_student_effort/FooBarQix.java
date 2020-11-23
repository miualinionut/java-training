package code._4_student_effort;

public class FooBarQix {
    private static String outStr = null;
    static boolean gasit = false;

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

    static String compute2(int nr)
    {
        gasit = false;
        String outString = "";
        if (nr % 3 == 0) {
            outString = "Foo";
            gasit = true;
        }
        if (nr % 5 == 0) {
            outString = outString + "Bar";
            gasit = true;
        }
        if (nr % 7 == 0) {
            outString = outString + "Qix";
            gasit = true;
        }
        char[] digits = String.valueOf(nr).toCharArray();
        for(char digit: digits)
        {
            switch (digit)
            {
                case '3': outString += "Foo"; gasit = true; break;
                case '5': outString += "Bar"; gasit = true; break;
                case '7': outString += "Qix"; gasit = true; break;
                case '0': outString +=  "*";  gasit = true; break;
            }
        }
        if(!gasit) outString += String.valueOf(nr);
        return outString;
    }


    public static void main(String[] args)
    {
        int nr = 67;
        System.out.println(compute(nr));

        nr = 67;
        System.out.println(compute2(nr));
    }
}
