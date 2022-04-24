package code._4_student_effort.Strategy;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {

        if (list.length < 2) {
            return;
        }

        int mid = list.length / 2;
        Integer[] listLeft = Arrays.copyOfRange(list, 0, mid);
        Integer[] listRight = Arrays.copyOfRange(list, mid, list.length);

        sort(listRight);
        sort(listLeft);

        merge(list, listLeft, listRight);
    }

    private void merge(Integer[] list, Integer[] listLeft, Integer[] listRight) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while(leftIndex<listLeft.length && rightIndex<listRight.length){
            if( listLeft[leftIndex].compareTo(listRight[rightIndex])<0){
                list[listIndex]=listLeft[leftIndex];
                leftIndex++;
            }else{
                list[listIndex]=listRight[rightIndex];
                rightIndex++;
            }
            listIndex++;
        }
        while(leftIndex<listLeft.length){
            list[listIndex]=listLeft[leftIndex];
            listIndex++;
            leftIndex++;
        }
        while(rightIndex<listRight.length){
            list[listIndex]=listRight[rightIndex];
            listIndex++;
            rightIndex++;
        }
    }
}
