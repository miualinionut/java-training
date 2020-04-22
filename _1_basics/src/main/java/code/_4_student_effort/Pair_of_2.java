package code._4_student_effort;
import java.util.*;
public class Pair_of_2 {
    public static void main(String[] args) {
        Scanner lel=new Scanner(System.in);
        int n=lel.nextInt(),cnt=0;
        List<Integer> l= new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(lel.nextInt());
        }
        for (int i = 0; i < l.size(); i++) {
            for (int j = i; j < l.size(); j++) {
                if(l.get(i)+l.get(j)==0){cnt++;l.remove(i);l.remove(j);}
            }
        }
        System.out.println(cnt);
    }
}
