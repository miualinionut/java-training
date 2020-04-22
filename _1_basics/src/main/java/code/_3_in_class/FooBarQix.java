package code._3_in_class;

public class FooBarQix {
    public static void main(String[] args) {
        int x = 303;
        System.out.println(compute(x));
    }

    static String compute(int x) {
        int copyX = x;
        int reversedX = 0;
        String finalString = new String();

        if (x % 3 == 0)
            finalString = finalString.concat("Foo");
        if (x % 5 == 0)
            finalString = finalString.concat("Bar");
        if (x % 7 == 0)
            finalString = finalString.concat("Qix");

        while(copyX != 0) {
            int digit = copyX % 10;
            reversedX = reversedX * 10 + digit;
            copyX /= 10;
        }
        while (reversedX != 0) {
            if(reversedX % 10 == 3) {
                finalString = finalString.concat("Foo");
            } else if (reversedX % 10 == 5) {
                finalString = finalString.concat("Bar");
            } else if (reversedX % 10 == 7) {
                finalString = finalString.concat("Qix");
            }
            reversedX = reversedX/10;
        }
        return finalString;
    }

//    static String compute2(int x) {
//
//    }
}
