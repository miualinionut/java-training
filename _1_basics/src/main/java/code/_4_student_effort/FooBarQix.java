package code._4_student_effort;

import java.util.Scanner;

public class FooBarQix {
    public static String compute(int i) {
        StringBuilder sb = new StringBuilder("");
        if (i % 3 == 0) {
            sb.append("Foo");
        }
        if (i % 5 == 0) {
            sb.append("Bar");
        }
        if (i % 7 == 0) {
            sb.append("Quix");
        }
        int lungimeString = sb.length();
        while (i != 0) {
            int ultimaCifra = i % 10;
            i = i / 10;
            if (ultimaCifra == 3) {
                sb.insert(lungimeString, "Foo");
            } else if (ultimaCifra == 5) {
                sb.insert(lungimeString, "Bar");
            } else if (ultimaCifra == 7) {
                sb.insert(lungimeString, "Quix");
            }

        }
        return sb.toString();
    }

    public static String compute2(int i) {
        StringBuilder sb = new StringBuilder("");
        if (i % 3 == 0) {
            sb.append("Foo");
        }
        if (i % 5 == 0) {
            sb.append("Bar");
        }
        if (i % 7 == 0) {
            sb.append("Quix");
        }
        int lungimeString = sb.length();
        while (i != 0) {
            int ultimaCifra = i % 10;
            i = i / 10;
            if (ultimaCifra == 3) {
                sb.insert(lungimeString, "Foo");
            } else if (ultimaCifra == 5) {
                sb.insert(lungimeString, "Bar");
            } else if (ultimaCifra == 7) {
                sb.insert(lungimeString, "Quix");
            } else if (ultimaCifra == 0) {
                sb.insert(lungimeString, "*");
            }

        }
        return sb.toString();
    }


    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int c = scan.nextInt();

        System.out.println(c + "=>" + compute(c));
        System.out.println(c + "=>" + compute2(c));

    }
}
