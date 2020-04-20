package code._4_student_effort;

import java.util.Scanner;

public class _3_challenge {
    public static void main(String[] args) {
        int nr, p = 0;
//citeste n si primul element
        Scanner s = new Scanner(System.in);
        nr = s.nextInt();
        int a[] = new int[nr];
        a[0] = s.nextInt();
        for (int i = 1; i < nr; i++) {   // citesc nr
            a[i] = s.nextInt();
            for (int j = 0; j < i; j++)
                if ((a[i] + a[j]) == 0) {
                    p++;
                    if (i != nr - 1) {
                        for (int h = j; h < i - 1; h++)
                            a[h] = a[h + 1];
                        a[i - 1] = s.nextInt();
                        nr = nr - 2;
                        i = i - 1;
                        j = -1;
                    }
                } else j = i + 1;

        }

        //  {p=p+1;
        //  a[i]=0;
        // a[j]=0;}}
        System.out.println(p);
    }
}

//adun cu fiecare nr si daca da 0
//incrementez nr de perechi si pun 0 in locul lor
//  }
// System.out.println("hello world");
//}
