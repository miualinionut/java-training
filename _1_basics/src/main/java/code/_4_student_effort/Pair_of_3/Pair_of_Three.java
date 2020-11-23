package code._4_student_effort.Pair_of_3;

import java.util.ArrayList;
import java.util.List;

public class Pair_of_Three {
    List<Integer> intList = new ArrayList<Integer>();

    public int pairOfThree(int []intArray){
        int nrOfPair = 0;
        for(int i =0; i < intArray.length; i++) {
            intList.add(intArray[i]);
        }

        int i = 0, ok = 0;
        while(i < intList.size()){
            System.out.println(intList.size());
            for(int j = i + 1; j < intList.size()-1; j++){
                for(int k = j + 1; k < intList.size(); k++) {

                    if (intList.get(i) + intList.get(j) + intList.get(k) == 0) {
                        intList.remove(k);
                        intList.remove(j);
                        intList.remove(i);
                        nrOfPair++;
                        ok = 1;
                        break;
                    }
                }
                if(ok == 1)
                    break;
            }

            if(ok == 0)
                i++;
            else
                ok = 0;
        }


        return nrOfPair;
    }
}
