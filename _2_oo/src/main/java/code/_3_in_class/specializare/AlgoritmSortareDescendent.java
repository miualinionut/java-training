package code._3_in_class.specializare;

public class AlgoritmSortareDescendent extends AlgoritmSortare{

    //override= polimorfism la rulare/dinamic
    @Override
    boolean sortDirection(int[] arr, int i, int j) {
        return arr[i]<arr[j];
    }
}
