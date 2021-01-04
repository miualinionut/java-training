package code._4_student_effort._3_generic_linked_list;

public class GenericList<T> implements IGenericList<T> {

    IGenericNode<T> rootValue;

    public GenericList(T rootValue) {
        this.rootValue = new GenericNode<>(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> current = rootValue;

        while(current.getNext() != null){
            current = current.getNext();
        }
        IGenericNode<T> toAdd = new GenericNode<>(element);
        current.setNext(toAdd);
    }

    @Override
    public void println() {
        IGenericNode<T> current = rootValue;

        while(current != null){
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
    }
}
