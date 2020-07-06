package code._4_student_effort._4_zigZag;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        System.out.println(zigZag(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    public static List<Integer> zigZag(List<Integer> arr){
        List<Integer> array = new ArrayList<>(arr);
        for(int i = 0; i <= array.size() - 2; i++){
            if(array.get(i) > array.get(i + 1)){
                Integer temp = array.get(i);
                array.set(i, array.get(i + 1));
                array.set(i + 1, temp);
            }

            if(array.get(i) < array.get(i + 1)){
                Integer temp = array.get(i);
                array.set(i, array.get(i + 1));
                array.set(i + 1, temp);
            }
        }

        return array;
    }
}
