package code._3_in_class.abstractizare;

public class AlgoritmSortareDescendent extends AlgoritmAbstract {
    boolean sortDirection(int[] arr, int i, int j){
        return arr[i] < arr[j];
    }
}
