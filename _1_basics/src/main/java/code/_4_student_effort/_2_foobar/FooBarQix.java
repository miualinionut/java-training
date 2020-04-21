package code._4_student_effort._2_foobar;

public class FooBarQix<s> {

    public static String compute(int i){
        String s = "";
        Pair p1= new Pair(3, "Foo");
        Pair p2 = new Pair(5,"Bar");
        Pair p3 = new Pair(7, "Qix");

        //daca sunt divizori
        if((i % p1.get_Key()) == 0) {
            s = s + (p1.get_val());
        }
        if((i % p2.get_Key()) == 0) {
            s = s + (p2.get_val());
        }
        if((i % p3.get_Key()) == 0){
            s = s + (p3.get_val());
        }

        String number = String.valueOf((i));
        for(int j = 0; j < number.length(); j++){
            char ch = number.charAt(j);
            if(ch == '3')
                s = s + p1.get_val();
            if(ch == '5')
                s = s + p2.get_val();
            if(ch == '7')
                s = s + p3.get_val();
        }


        if (s.isEmpty()) {
            s = String.valueOf(i);
        }

    return s;
    }

    public static String compute2(int i){
        String s = "";

        Pair p1= new Pair(3, "Foo");
        Pair p2 = new Pair(5,"Bar");
        Pair p3 = new Pair(7, "Qix");
        Pair p4 = new Pair(0,"*");

        if((i % p1.get_Key()) == 0) {
            s = s + (p1.get_val());
        }
        if((i % p2.get_Key()) == 0) {
            s = s + (p2.get_val());
        }
        if((i % p3.get_Key()) == 0){
            s = s + (p3.get_val());
        }

        String number = String.valueOf((i));
        for(int j = 0; j < number.length(); j++){
            char ch = number.charAt(j);
            if(ch == '3')
                s = s + p1.get_val();
            if(ch == '5')
                s = s + p2.get_val();
            if(ch == '7')
                s = s + p3.get_val();
            if(ch == '0')
                s = s + p4.get_val();
        }


        if (s.isEmpty()) {
            s = String.valueOf(i);
        }


        return s;
    }

    public static void main(String[] args){
        String s = "";
        for(int i = 1; i <= 100; i++)
            s = s + (compute(i));

        String another_string = "";
        another_string = compute2(10101);

        System.out.println(s);
        System.out.print(another_string);
    }

}
