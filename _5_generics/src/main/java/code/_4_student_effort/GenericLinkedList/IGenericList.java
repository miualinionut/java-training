package code._4_student_effort.GenericLinkedList;

public interface IGenericList<T extends IGenericNode> {

    void insert(T elem);
    void println();
    int getLength();
}
