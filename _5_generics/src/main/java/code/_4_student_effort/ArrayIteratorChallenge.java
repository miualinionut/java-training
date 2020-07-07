package code._4_student_effort;
public class ArrayIteratorChallenge {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        GenericList<Integer> a = new GenericList<>(2);
        GenericList<Integer> b = new GenericList<>(2);
        a.insert(22);
        b.insert(13);
        GenericList<Integer>[] array = new GenericList[2];
        array[0] = a;
        array[1] = b;
        IArrayIterator<GenericList<Integer>> it1 = new ArrayIterator<>(array);
        while (it1.hasNext()) {
            GenericList<Integer> m = it1.next();
            m.println();
        }
    }
}
