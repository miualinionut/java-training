package code._4_student_effort.Pair_of_2;

import java.util.ArrayList;
import java.util.List;

public class PairOfTwo {
    List<Integer> intList = new ArrayList<Integer>();

    public int pairOfTwo(int []intArray){
        int nrOfPair = 0;
        for(int i =0; i < intArray.length; i++) {
            intList.add(intArray[i]);
        }

        int i = 0, ok = 0;
        while(i < intList.size() - 1){
            for(int j = i + 1; j < intList.size(); j++){
                if(intList.get(i) + intList.get(j)== 0)
                {

                    intList.remove(j);
                    intList.remove(i);
                    nrOfPair++;
                    ok = 1;
                    break;
                }

            }
            if(ok == 0)
                i++;
            else
                ok = 0;
        }


        return nrOfPair;
    }
}
