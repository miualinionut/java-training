package code._4_student_effort.GenericBinarySearch;

public class ArrayNotSortedException extends RuntimeException {

    public ArrayNotSortedException(){
        super("Acest vector nu este sortat");
    }
}
