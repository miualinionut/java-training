package code._4_student_effort._4_genericIterator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2, 3};
        IArrayiterator<Integer> it = new ArrayIterator<>(arr, 0);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
