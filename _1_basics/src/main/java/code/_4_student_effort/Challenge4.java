package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge4 {
    public static Integer FindPairsof3(Integer[] num){
        Integer nrPairs=0;
        ArrayList<Integer> copy=new ArrayList<Integer>(Arrays.asList(num));
        Integer[] usedJ=new Integer[num.length];
        for(int i=0;i< copy.size() -2;++i){
            boolean Findflag=false;
            for(int j=i;j<copy.size()-1;++j) {
                for (int z= j; z < copy.size(); ++z) {
                    if (Findflag == false && (copy.get(i) + copy.get(j) +copy.get(z) == 0)) {
                        copy.remove(j);
                        copy.remove(z-1);
                        Findflag = true;
                        nrPairs++;
                    }

                }
            }
        }



        return nrPairs;

    }

    public static void main(String[] args) {
        Integer[] x={-1,-1,1,2,1,-2};
        Integer z=FindPairsof3(x);
        System.out.println("Numbers of pairs= "+z);
    }}
