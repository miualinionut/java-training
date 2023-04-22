package code._3_in_class.specializare;

public class AlgoritmSortareDescendent extends AlgoritmSortare{
    @Override
    boolean sortDirection(int[] arr, int i, int j) {
        return arr[i]<arr[j];
    }
}
