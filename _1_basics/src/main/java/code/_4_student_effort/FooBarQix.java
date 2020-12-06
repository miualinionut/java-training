package code._4_student_effort;

public class FooBarQix {

     public static String compute1(int n){
        String s;
        String a = "";
        String c2 = compute2(n);
        s = String.valueOf(n);
        if((n % 3) == 0)
            a = a.concat("Foo");
        if((n % 5) == 0)
            a = a.concat("Bar");
        if((n % 7) == 0)
            a = a.concat("Qix");

        for(int i = 0; i<s.length(); i=i+1){
            if(a.isEmpty() && s.charAt(i) == '0')
            if(s.charAt(i) == '3')
                a = a.concat("Foo");
            if(s.charAt(i) == '5')
                a = a.concat("Bar");
            if((s.charAt(i)) == '7')
                a = a.concat("Qix");
        }
        if(a.isEmpty())
            a = s;
        return a;
    }

    public static String compute2(int n){
         String s;
         s = String.valueOf(n);
         s = s.replaceAll("0","*");
         return s;
     }

    public static void main(String[] args) {
       String val = compute1(10101);
       System.out.print(val);
    }
}
