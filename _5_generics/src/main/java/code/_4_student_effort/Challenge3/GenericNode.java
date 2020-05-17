package code._4_student_effort.Challenge3;

public class GenericNode<T> implements IGenericNode<T> {

   private T val;
   private IGenericNode<T> nextElement;

    @Override
    public T getValue() {
        return val;
    }

    @Override
    public void setValue(T value) {
            this.val=value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return this.nextElement;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.nextElement=next;
    }
}
