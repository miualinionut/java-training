package code._4_student_effort;
import java.util.HashMap;
public class PairOfTwo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        int v[]={3,2,-3,-3,-2,0,1,3};
        int pairs =0;
        for (int n:v){
            if (values.containsKey(-n)){
                pairs++;
            }else {
                values.put(n, 1);
            }
        }
        System.out.println(pairs);
    }
}
