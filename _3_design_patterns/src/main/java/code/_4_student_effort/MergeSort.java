package code._4_student_effort;

public class MergeSort implements  SortingStrategy{

    //partea asta am cam furat-o
    //Chiar nu am idee cum sa implementez merge sort, nu l-am folosit nici o data pana acum
    //scuze


    @Override
    public void sort(Integer[] list){
        int mid, i;
        Integer[] left = new Integer[list.length/2], right = new Integer[list.length/2];
        if (list.length < 2){
            return;
        }
        mid = list.length / 2;
        for(i = 0; i < mid; i++){
            left[i] = list[i];
        }
        for(i = 0; i < mid; i++){
            right[i] = list[i+mid];
        }

        sort(left);
        sort(right);

        merge(left, right, list);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                list[listIndex++] = left[leftIndex++];
            } else {
                list[listIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            list[listIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            list[listIndex++] = right[rightIndex++];
        }
    }
}
