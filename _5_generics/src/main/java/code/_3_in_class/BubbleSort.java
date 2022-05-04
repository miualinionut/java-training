package code._3_in_class;

import java.util.Comparator;


public class BubbleSort<Q> {
    public <T extends Comparable<T>> void sort(T[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j< list.length; j++){
                if (list[i].compareTo(list[j]) > 0) {
                    T temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    //void m(List<Integer> list){}
    //void m(List<Double> list){}

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        //ArrayList list1; // raw
        //ArrayList<Integer> list2; // generic


        Integer[] i = new Integer[]{3, 2, 6};
        Short[] s = new Short[]{3, 2, 6};
        Byte[] b = new Byte[]{3, 2, 6};
        Double[] d = new Double[]{3d, 2d, 6d};

        bubbleSort.sort(i);
        bubbleSort.sort(s);
        bubbleSort.sort(b);
        bubbleSort.sort(d);
        bubbleSort.sort(d);

        for (Integer integer : i) {
            System.out.println(integer);
        }
    }


}

