package code._4_student_effort;

import javax.swing.event.InternalFrameListener;

public class ArrayIteratorTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()) {
            System.out.print (it.next() + " ");
        }
        System.out.println("\n");

        GenericLinkedList<Integer> a = new GenericLinkedList<>(2);
        GenericLinkedList<Integer> b = new GenericLinkedList<>(2);
        GenericLinkedList<Integer> c = new GenericLinkedList<>(2);
        a.insert(5);
        a.insert(7);
        b.insert(100);
        b.insert(1000);

        GenericLinkedList<Integer>[] arr1 = new GenericLinkedList[3];
//        GenericLinkedList[] arr1 = new GenericLinkedList[3];

        arr1[0] = a;
        arr1[1] = b;
        arr1[2] = c;

        IArrayIterator<GenericLinkedList<Integer>> it1 = new ArrayIterator<GenericLinkedList<Integer>>(arr1);
        while (it1.hasNext()) {
            GenericLinkedList<Integer> t = it1.next();
            t.println();
        }
    }

}
