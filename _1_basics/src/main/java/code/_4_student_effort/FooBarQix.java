package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {
        for(int i = 1; i <= 101; i++)
            System.out.println(compute2(i));
    }
    public static String compute(int i){
        StringBuilder sir = new StringBuilder();
        if (i % 3 == 0) sir.append("Foo");
        if (i % 5 == 0) sir.append("Bar");
        if (i % 7 == 0) sir.append("Qix");
        char [] zecimale = String.valueOf(i).toCharArray();
        for(char zecimala : zecimale){
            if(zecimala == '3') sir.append("Foo");
            if(zecimala == '5') sir.append("Bar");
            if(zecimala == '7') sir.append("Qix");
        }
            if(sir.toString().equals(""))
                sir.append(i);
        return sir.toString();
        }

    public static String compute2(int i){
        StringBuilder sir = new StringBuilder();
        boolean divizibil = false;
        if (i % 3 == 0) {sir.append("Foo"); divizibil = true;}
        if (i % 5 == 0) {sir.append("Bar"); divizibil = true;}
        if (i % 7 == 0) {sir.append("Qix"); divizibil = true;}
        char [] zecimale = String.valueOf(i).toCharArray();
        for(char zecimala : zecimale){
            if(zecimala == '3') sir.append("Foo");
            else if(zecimala == '5') sir.append("Bar");
            else if(zecimala == '7') sir.append("Qix");
            else if(zecimala == '0') sir.append("*");
            else if(!divizibil) sir.append(zecimala);
        }
        return sir.toString();
    }
    }
