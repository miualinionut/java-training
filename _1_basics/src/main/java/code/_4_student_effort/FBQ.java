package code._4_student_effort;

public class FBQ {
    int nr;
    String word;

    public FBQ(int n, String w){
        nr = n;
        word = w;
    }
    static int nrOfDigits(int n)
    {
        int nr = 0;
        do {
            nr++;
            n /= 10;
        }while(n != 0 );
        return nr;
    }
    static int[] nrToArray(int n)
    {
        int nDigits = nrOfDigits(n);
        int[] v = new int[nDigits];
        for(int i = nDigits - 1; i >= 0; i--)
        {
            v[i] = n % 10;
            n /= 10;
        }
        return v;
    }
    static String compute(int i) {

        FBQ[] corelations = { new FBQ(3, "Foo"),
                             new FBQ(5, "Bar"),
                             new FBQ(7, "Quix")
        };
        int[] v =  nrToArray(i);
        boolean isDivisible = false;
        String s= "";
        for(FBQ corelation : corelations)
        {
            if(i % corelation.nr == 0)
            {
                isDivisible = true;
                s += corelation.word;
            }

        }
        boolean hadDigit = false;
        for(FBQ corelation : corelations)
        {
            for(int j : v)
                if(j == corelation.nr)
                {
                    s += corelation.word;
                    hadDigit = true;
                }
        }
        if(!isDivisible && !hadDigit)
            s += String.valueOf(i);
        return s;

    }

    public static void main(String[] args) {

        String s = "";
        for(int i = 1; i <= 100; i++)
        {
            s = "";
            s += compute(i);
            System.out.println(s);
        }
        /*int nr = 3457;
        int[] v = nrToArray(nr);
        for(int i : v)
            System.out.println(i + " ");*/

    }
}
