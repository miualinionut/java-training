package code._4_student_effort.challenge4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ZigZag {

    public static List<Integer> ZigZagify(List<Integer> arr){
        List<Integer> tempArr=new ArrayList<>(arr);
        boolean odd=true;
        for(int i=0;i<tempArr.size()-1;i++){
            if(odd){
                if(tempArr.get(i)>tempArr.get(i+1)){
                    Integer aux=tempArr.get(i);
                    tempArr.set(i,tempArr.get(i+1));
                    tempArr.set(i+1,aux);
                }
            }
            else{
                if(tempArr.get(i)<tempArr.get(i+1)){
                    Integer aux=tempArr.get(i);
                    tempArr.set(i,tempArr.get(i+1));
                    tempArr.set(i+1,aux);
                }
            }
            odd=!odd;
        }

        return tempArr;
    }

    public static void main(String[] args) {
        List<Integer> arr=asList(4,3,7,8,6,2,1);
        System.out.println(ZigZagify(arr));
    }
}
