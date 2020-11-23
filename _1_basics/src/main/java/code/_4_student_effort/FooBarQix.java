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
            if(digit == '3') outString += "Foo";
            else if(digit == '5') outString += "Bar";
            else if(digit == '7') outString += "Qix";
            else if(digit == '0') outString += "*";
            else if(!gasit) outString += String.valueOf(digit);
        }
        return outString;
    }


    public static void main(String[] args)
    {
        int nr = 51;
        System.out.println(compute(nr));
        gasit = false;
        nr = 105;
        System.out.println(compute2(nr));
    }
}
