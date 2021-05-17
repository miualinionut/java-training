package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {
        //Stage 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(compute(i));
        }
        System.out.println(compute(13));
        System.out.println(compute(15));
        System.out.println(compute(21));
        System.out.println(compute(33));
        System.out.println(compute(51));
        System.out.println(compute(53));

        //Stage 2
        System.out.println(compute2(101));
        System.out.println(compute2(303));
        System.out.println(compute2(105));
        System.out.println(compute2(10101));
    }

    public static String compute(int i) {
        String s = "";
        if (i % 3 == 0)
            s += "Foo";
        if (i % 5 == 0)
            s += "Bar";
        if (i % 7 == 0)
            s += "Qix";

        int[] arr = new int[String.valueOf(i).length()];
        int copy = i, digit, index = 0;
        while (copy != 0) {
            digit = copy % 10;
            arr[index] = digit;
            index++;
            copy /= 10;
        }
        for(int j = index - 1; j >= 0; j--) {
            if (arr[j] == 3)
                s += "Foo";
            else if (arr[j] == 5)
                s += "Bar";
            else if (arr[j] == 7)
                s += "Qix";
        }
        if(s.length() == 0)
            s += i;

        s = i + "=>" + s;
        return s;
    }

    public static String compute2(int i) {
        String s = "";
        boolean isDivisible = false;
        if (i % 3 == 0)
            s += "Foo";
        if (i % 5 == 0)
            s += "Bar";
        if (i % 7 == 0)
            s += "Qix";

        if(s.length() != 0)
            isDivisible = true;

        int[] arr = new int[String.valueOf(i).length()];
        int copy = i, digit, index = 0;
        while (copy != 0) {
            digit = copy % 10;
            arr[index] = digit;
            index++;
            copy /= 10;
        }
        for(int j = index - 1; j >= 0; j--) {
            digit = arr[j];
            if (digit == 3)
                s += "Foo";
            else if (digit == 5)
                s += "Bar";
            else if (digit == 7)
                s += "Qix";
            else if (digit == 0)
                s += "*";
            else if (!isDivisible)
                s += digit;
        }
        if(s.length() == 0)
            s += i;

        s = i + "=>" + s;
        return s;
    }
}
