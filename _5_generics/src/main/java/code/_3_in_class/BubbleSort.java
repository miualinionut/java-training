package code._3_in_class;

public class BubbleSort {

    public <T extends Comparable>void sort(T[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[i].compareTo(list[j]) > 0) {
                    T temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
