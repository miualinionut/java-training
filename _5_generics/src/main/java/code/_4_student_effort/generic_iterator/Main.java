package code._4_student_effort.generic_iterator;

import code._4_student_effort.generic_linked_list.GenericList;
import code._4_student_effort.generic_linked_list.GenericNode;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
