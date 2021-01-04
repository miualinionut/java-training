package code._4_student_effort._5_generic_binary_search;

public class ArrayNotSortedException extends RuntimeException{
    public ArrayNotSortedException() {
        super("Array is not sorted");
    }
}
