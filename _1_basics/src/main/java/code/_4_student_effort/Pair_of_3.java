package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pair_of_3 {
    public static void main(String[] args) {
        Scanner lel=new Scanner(System.in);
        int n=lel.nextInt(),cnt=0;
        List<Integer> l= new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(lel.nextInt());
        }
        for (int i = 0; i < l.size(); i++) {
            for (int j = i; j < l.size(); j++) {
                for (int k = j; k < l.size(); k++) {
                    if (l.get(i) + l.get(j) + l.get(k) == 0) {
                        cnt++;
                        System.out.println("lmao");
                        l.remove(k);
                        l.remove(j);
                        l.remove(i);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
