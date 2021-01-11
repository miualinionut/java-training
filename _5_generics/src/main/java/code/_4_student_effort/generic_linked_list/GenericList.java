package code._4_student_effort.generic_linked_list;

public class GenericList<T> implements IGenericList<T>{
    private IGenericNode<T> root;

    public GenericList(T value) {
        root = new GenericNode<>();
        root.setValue(value);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> aux = root;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }

        IGenericNode<T> newElement = new GenericNode<>();
        newElement.setValue(element);
        aux.setNext(newElement);

    }

    @Override
    public void println() {
        IGenericNode<T> aux = root;
        while (aux.getNext() != null) {
            System.out.print(aux.getValue() + ", ");
            aux = aux.getNext();
        }
    }
}
