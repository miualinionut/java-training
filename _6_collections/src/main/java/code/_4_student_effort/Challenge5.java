package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge5 {

    public static List<Integer> mergeArrays(List<Integer> list1, List<Integer> list2){
        int j = 0; int i =0;
        List<Integer> result = new ArrayList<>();

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j) ){
                result.add(list1.get(i));
                i++;
            }
            else{
                result.add(list2.get(j));
                j++;
            }
        }
        for(int k = i; k < list1.size(); k++)
            result.add(list1.get(k));

        for(int k = j; k < list2.size(); k++)
            result.add(list2.get(k));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,6,7,8,9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4));

        List<Integer> result = mergeArrays(list1,list2);

        for(Integer item : result){
            System.out.print(item + " ");
        }
    }
}
