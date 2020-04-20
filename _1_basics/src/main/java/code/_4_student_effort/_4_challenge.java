package code._4_student_effort;

import java.util.Scanner;

public class _4_challenge {
    public static void main(String[] args) {
        int nr, p = 0;
//citeste n si primul element
        Scanner s = new Scanner(System.in);
        nr = s.nextInt();
        int a[] = new int[nr];
        a[0] = s.nextInt();
        a[1] = s.nextInt();
        for (int i = 2; i < nr; i++) {   // citesc nr
            a[i] = s.nextInt();
            for (int j = 0; j < i; j++)
                for (int k = j + 1; k < i; k++)
                    if ((a[i] + a[j] + a[k]) == 0) {
                        p++;
                        if (i != nr - 1) {
                            for (int h = j; h < i - 1; h++)
                                a[h] = a[h + 1];
                            for (int h = k - 1; h < i - 1; h++)
                                a[h] = a[h + 1];

                            if (i - 2 == 1 && (nr - i - 1) >= 2) {
                                a[i - 2] = s.nextInt();
                                a[i - 1] = s.nextInt();
                                i = i - 1;
                            } else if ((nr - i - 1) != 0) {
                                a[i - 2] = s.nextInt();
                                i = i - 2;
                            }
                            nr = nr - 3;
                            j = -1;
                        } else {
                            j = i + 1;
                            break;
                        }
                    }

        }


        System.out.println(p);
    }
}

