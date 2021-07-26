package code._4_student_effort.CodeChallange5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(1, 5, 6);
        List<Integer> array2 = Arrays.asList(2, 3, 4);

        List<Integer> mergedArray = merge(array1, array2);
        System.out.println(mergedArray);
    }

    public static List<Integer> merge(List<Integer> array1, List<Integer> array2){
        List<Integer> mergedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(!(i == array1.size() && j == array2.size())){
            if(i == array1.size()){
                for(; j < array2.size(); j++){
                    mergedArray.add(array2.get(j));
                }
            }
            else if(j == array2.size()){
                for(; i < array1.size(); i++){
                    mergedArray.add(array1.get(i));
                }
            }
            else if(array1.get(i) < array2.get(j)){
                mergedArray.add(array1.get(i));
                i++;
            }
            else if(array1.get(i) > array2.get(j)){
                mergedArray.add(array2.get(j));
                j++;
            }
        }

        return mergedArray;
    }
}
