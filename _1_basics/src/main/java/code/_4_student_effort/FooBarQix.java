package code._4_student_effort;

public class FooBarQix
{
    public static String compute(int x)
    {
        String string = "";
        boolean ok1 = Boolean.FALSE;
        boolean ok2 = Boolean.FALSE;

        if (x % 3 == 0)
        {
            string = string + "Foo";
            ok1 = Boolean.TRUE;
        }

        if (x % 5 == 0)
        {
            string = string + "Bar";
            ok1 = Boolean.TRUE;
        }

        if (x % 7 == 0)
        {
            string = string + "Qix";
            ok1 = Boolean.TRUE;
        }

        String aux = String.valueOf(x);
        for(int cif = 0; cif < aux.length(); cif++)
        {
            if (aux.charAt(cif) == '0')
            {
                string = string + "*";
            }

            if (aux.charAt(cif) == '3')
            {
                string = string + "Foo";
                ok2 = Boolean.TRUE;
            }

            if (aux.charAt(cif) == '5')
            {
                string = string + "Bar";
                ok2 = Boolean.TRUE;
            }

            if (aux.charAt(cif) == '7')
            {
                string = string + "Qix";
                ok2 = Boolean.TRUE;
            }
        }

        if (ok1 == Boolean.FALSE && ok2 == Boolean.FALSE)
        {
            string = "";
            String aux1 = String.valueOf(x);
            for (int cif = 0; cif < aux1.length(); cif++)
            {
                if (aux.charAt(cif) == '0')
                {
                    string = string + "*";
                }
                else
                    string = string + aux.charAt(cif);
            }
        }
        return (string);
    }

    public static void main(String[] args)
    {
        int[] list = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 21, 33, 51, 53, 101, 303, 105, 10101};

        for (int i : list)
        {
            String x = compute(i);
            System.out.println(x);
        }
    }
}

