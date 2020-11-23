package code._4_student_effort;

public class FooBarQix {

    private static String compute(int value){
        StringBuilder res = new StringBuilder();
        String stringValue = Integer.toString(value);
        if(value%3==0)
            res.append("Foo");
        else
            res.append(value);
        if(value%5==0)
            res.append("Bar");
        if(value%7==0)
            res.append("Qix");
        for(int i=0;i<stringValue.length();++i)
            if(stringValue.charAt(i)=='3')
                res.append("Foo");
            else if(stringValue.charAt(i)=='5')
                res.append("Bar");
            else if(stringValue.charAt(i)=='7')
                res.append("Qiz");
            else if(stringValue.charAt(i)=='0')
                res.append("*");
        return res.toString().replace('0', '*');
    }

    public static void main(String[] args) {

        System.out.println(compute(101));

    }

}
