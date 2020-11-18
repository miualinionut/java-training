package code._4_student_effort.Challange2;


public class Challange2 {

    private static int revert(int a)
    {
        int rev = 0;
        int cif;
        while(a > 0)
        {
            cif = a % 10;
            a = a / 10;
            rev = rev * 10 + cif;
        }
        return rev;
    }

    private static String compute(int a)
    {
        String out = new String("");
        int cifra, rev;
        if(a % 3 == 0)
            out = out.concat("Foo");
        if(a % 5 == 0)
            out = out.concat("Bar");
        if(a % 7 == 0)
            out = out.concat("Qix");

        rev = revert(a);
        while(rev > 0)
        {
            cifra = rev % 10;
            rev = rev / 10;
            if(cifra == 3)
                out = out.concat("Foo");
            if(cifra == 5)
                out = out.concat("Bar");
            if(cifra == 7)
                out = out.concat("Qix");
        }

        if(out.length() == 0)
            out = String.valueOf(a);

        return out;
    }


    private static boolean containsOnly(String str, char c)
    {
        for(int i = 0 ; i < str.length(); i++)
            if(str.charAt(i) != c)
                return false;
        return true;
    }

    private static String compute2(int a)
    {
        String out = new String("");
        int cifra;
        int rev = 0;
        if(a % 3 == 0)
            out = out.concat("Foo");
        if(a % 5 == 0)
            out = out.concat("Bar");
        if(a % 7 == 0)
            out = out.concat("Qix");

        rev = revert(a);
        while(rev > 0)
        {
            cifra = rev % 10;
            rev = rev / 10;
            if(cifra == 3)
                out = out.concat("Foo");
            if(cifra == 5)
                out = out.concat("Bar");
            if(cifra == 7)
                out = out.concat("Qix");
            if(cifra == 0)
                out = out.concat("*");
        }

        if(out.length() == 0)
            out = String.valueOf(a);

        if(containsOnly(out,'*'))
        {
            out = new String("");
            rev = revert(a);
            while(rev > 0)
            {
                cifra = rev % 10;
                rev = rev / 10;
                if(cifra == 0)
                    out = out.concat("*");
                else
                    out = out.concat(String.valueOf(cifra));
            }
        }

        return out;
    }

    public static void main(String[] args) {
        int maxNumber = 20;
        for(int i = 0; i <= maxNumber; i++)
        {
            System.out.println(compute(i));
        }
        System.out.println("");
        System.out.println(compute2(1601));
        System.out.println(compute2(303));
        System.out.println(compute2(105));
        System.out.println(compute2(10101));

    }
}
