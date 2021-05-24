package code._4_student_effort;

/*
Moise Gabriel
 */

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        //Code challenge 1
        /*
        boolean printnumber;
        for (int i = 1; i <= 100; ++i) {
            printnumber = true;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                printnumber = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                printnumber = false;
            }
            //For stage 2
            if (i % 7 == 0) {
                System.out.print("Rizz");
                printnumber = false;
            }
            if (i % 11 == 0) {
                System.out.print("Jazz");
                printnumber = false;
            }
            if (printnumber) {
                System.out.print(i);
            }
            System.out.print(", ");
        }
         */
        //Code challenge 2 stage 1
        /*
        for (int i = 1; i <= 100; ++i) {
            String str = compute(i);
            System.out.print(str + ", ");
        }

         */
        //Code challenge 2 stage 2
        /*
        String str = compute2(101);
        System.out.println("101 => " + str);
        str = compute2(303);
        System.out.println("303 => " + str);
        str = compute2(105);
        System.out.println("105 => " + str);
        str = compute2(10101);
        System.out.println("10101 => " + str);
         */

        //Code challenge 3
        /*
        int[] array = new int[]{5, 9, -5, 7, -5};
        int pairs2 = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = i+1; j < array.length; ++j) {
                if(array[i] + array[j] == 0 & array[j] < Integer.MAX_VALUE) {
                    array[j] = Integer.MAX_VALUE;
                    pairs2++;
                    break;
                }
            }
        }
        System.out.println(pairs);
         */

        //Code challenge 4
        int[] array1 = new int[]{-1, -1, -1, 2};
        int pairs3 = 0;
        for (int i = 0; i < array1.length; ++i) {
            for (int j = i + 1; j < array1.length; ++j) {
                for (int k = j + 1; k < array1.length; ++k) {
                    if (array1[i] + array1[j] + array1[k] == 0 & array1[j] < Integer.MAX_VALUE & array1[k] < Integer.MAX_VALUE) {
                        array1[j] = Integer.MAX_VALUE;
                        array1[k] = Integer.MAX_VALUE;
                        pairs3++;
                        break;
                    }
                }
            }
        }
        System.out.println(pairs3);
    }

    public static String compute(int x) {
        Integer val = Integer.valueOf(x);
        String str = "";
        boolean printnumber = true;

        if (x % 3 == 0) {
            str = str + "Foo";
            printnumber = false;
        }
        if (x % 5 == 0) {
            str = str + "Bar";
            printnumber = false;
        }
        if (x % 7 == 0) {
            str = str + "Qix";
            printnumber = false;
        }

        while (x > 0) {
            if (x % 10 == 3) {
                str = str + "Foo";
                printnumber = false;
            }
            if (x % 10 == 5) {
                str = str + "Bar";
                printnumber = false;
            }
            if (x % 10 == 7) {
                str = str + "Qix";
                printnumber = false;
            }
            x = x/10;
        }

        if (printnumber) {
            str = val.toString();
        }
        return str;
    }

    public static String compute2(int x) {
        Integer val = Integer.valueOf(x);
        String str = "";
        boolean printnumber = true;

        if (x % 3 == 0) {
            str = str + "Foo";
            printnumber = false;
        }
        if (x % 5 == 0) {
            str = str + "Bar";
            printnumber = false;
        }
        if (x % 7 == 0) {
            str = str + "Qix";
            printnumber = false;
        }

        int inv = 0;
        while (x > 0) {
            inv = inv * 10 + x % 10;
            x = x/10;
        }
        int inv1 = inv;
        while (inv > 0) {
            if (inv % 10 == 3) {
                str = str + "Foo";
                printnumber = false;
            }
            if (inv % 10 == 5) {
                str = str + "Bar";
                printnumber = false;
            }
            if (inv % 10 == 7) {
                str = str + "Qix";
                printnumber = false;
            }
            if (!printnumber & (inv % 10 == 0)) {
                str = str + "*";
            }
            inv = inv/10;
        }

        if (printnumber) {
            do {
                if (inv1 % 10 == 0) {
                    str = str + "*";
                } else
                    str = str + inv1 % 10;
                inv1 = inv1 / 10;
            }
            while (inv1 > 0);
        }
        return str;
    }
}
