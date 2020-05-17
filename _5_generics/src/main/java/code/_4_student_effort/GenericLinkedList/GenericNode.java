package code._4_student_effort.GenericLinkedList;

public class GenericNode<T> implements IGenericNode<T> {

    private T value;
    IGenericNode<T> next;

    @Override
    public T getValue(){
        return value;
    }
    @Override
    public void setValue(T value){
        this.value = value;
    }
    @Override
    public IGenericNode<T> getNext(){
        return next;
    }
    @Override
    public void setNext(IGenericNode<T> next){
        this.next = next;
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
