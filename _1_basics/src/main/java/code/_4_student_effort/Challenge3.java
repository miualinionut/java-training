package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge3 {
    public static Integer FindPairs(Integer[] num){
        Integer nrPairs=0;
        ArrayList<Integer> copy=new ArrayList<Integer>(Arrays.asList(num));
        Integer[] usedJ=new Integer[num.length];
        for(int i=0;i< copy.size() -1;++i){
            boolean Findflag=false;
            for(int j=i;j<copy.size();++j){
                if(Findflag==false&&(copy.get(i)+copy.get(j)==0)){
                    copy.remove(j);
                    Findflag=true;
                    nrPairs++;
                }

            }
        }



        return nrPairs;

    }

    public static void main(String[] args) {
        Integer[] x={-3,-2,3,2,3,-2,0};
        Integer z=FindPairs(x);
        System.out.println("Numbers of pairs= "+z);
    }
}
