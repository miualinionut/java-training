package code._4_student_effort;

public class Challenge2 {
    
    private static String outStr = null;
    static boolean found = false;

    static String compute(int nr)
    {
        if(outStr == null) {
            outStr = "";
            if (nr % 3 == 0) {
                outStr = "Foo";
                found = true;
            }
            if (nr % 5 == 0) {
                outStr = outStr + "Bar";
                found = true;
            }
            if (nr % 7 == 0) {
                outStr = outStr + "Qix";
                found = true;
            }
        }
        if(nr != 0)
        {
            compute(nr / 10);
            int digit = nr % 10;
            switch (digit)
            {
                case 3: outStr += "Foo"; found = true; break;
                case 5: outStr += "Bar"; found = true; break;
                case 7: outStr += "Qix"; found = true; break;
            }
        }
        if(!found)
        {
            return "" + nr;
        }
        return outStr;
    }

    static String compute2(int nr)
    {
        found = false;
        String outString = "";
        if (nr % 3 == 0) {
            outString = "Foo";
            found = true;
        }
        if (nr % 5 == 0) {
            outString = outString + "Bar";
            found = true;
        }
        if (nr % 7 == 0) {
            outString = outString + "Qix";
            found = true;
        }
        char[] digits = String.valueOf(nr).toCharArray();
        for(char digit: digits)
        {
            switch (digit)
            {
                case '3': outString += "Foo"; found = true; break;
                case '5': outString += "Bar"; found = true; break;
                case '7': outString += "Qix"; found = true; break;
                case '0': outString +=  "*";  found = true; break;
            }
        }
        if(!found) outString += String.valueOf(nr);
        return outString;
    }


    public static void main(String[] args)
    {
        int nr = 72;
        System.out.println(compute(nr));

        nr = 72;
        System.out.println(compute2(nr));
    }
}