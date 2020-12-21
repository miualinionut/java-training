package code._4_student_effort;

public interface IGenericListNode <T>{

    T getValue();
    void setValue (T value);

    void setNext(IGenericListNode<T> next);
    IGenericListNode<T> getNext();
}
