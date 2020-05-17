package code._4_student_effort.code_challenge_3_Generic_Linked_List;

public interface IGenericNode <T> {

    T getValue();
    void setValue(T element);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
