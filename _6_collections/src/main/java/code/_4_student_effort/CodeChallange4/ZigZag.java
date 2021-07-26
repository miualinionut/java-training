package code._4_student_effort.CodeChallange4;

import java.util.List;

import static java.util.Arrays.asList;

public class ZigZag {
    public static void main(String[] args) {
        List<Integer> array = zigZag(asList(4, 3, 7, 8, 6, 2, 1));
        System.out.println(array);
    }

    public static List<Integer> zigZag (List<Integer> array){
        boolean sign = true; // true -> expected "<"; false -> expected ">"

        for(int i = 0; i < array.size() - 1; i++){
            if(sign){
                if(array.get(i) > array.get(i + 1)){
                    Integer aux = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, aux);
                }
                sign = false;
            }
            else {
                if(array.get(i) < array.get(i + 1)){
                    Integer aux = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, aux);
                }
                sign = true;
            }
        }

        return array;
    }
}
