package code._4_student_effort.Template;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};

        Integer[] copy01 = Arrays.copyOf(arr,arr.length);
        Integer[] copy02 = Arrays.copyOf(arr,arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy01);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy02);

        display(copy01);
        display(copy02);


    }

    private static void display(Integer[] copy) {
        for(int i : copy){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
