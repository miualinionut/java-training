package code._4_student_effort.challenge2;

public class FooBarQix {

    static NumberWordCorrelation obj1 = new NumberWordCorrelation("Foo", 3);
    static NumberWordCorrelation obj2 = new NumberWordCorrelation("Bar", 5);
    static NumberWordCorrelation obj3 = new NumberWordCorrelation("Qix", 7);

    public static String compute(int currentNumber)
    {
        String s = "";
        if(currentNumber % 3 == 0)
            s += obj1.getName();
        if(currentNumber % 5 == 0)
            s += obj2.getName();
        if(currentNumber % 7 == 0)
            s += obj3.getName();

        char[] digits = String.valueOf(currentNumber).toCharArray();
        for(char digit : digits)
        {
            if(digit == '3')
                s += obj1.getName();
            if(digit == '5')
                s += obj2.getName();
            if(digit == '7')
                s += obj3.getName();
        }

        if(s.isEmpty())
            s = String.valueOf(currentNumber);

        return s;

    }

    public static void main(String[] args) {
        for(int i=1;i<=1000;i++)
            System.out.println(compute(i));
    }

}
