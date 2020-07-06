package code._4_student_effort._3_linkedList;

public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> root;

    public GenericList(T root){
        this.root = new GenericNode<>();
        this.root.setValue(root);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> iterator = this.root;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        IGenericNode<T> newNode = new GenericNode();
        newNode.setValue(element);
        iterator.setNext(newNode);
    }

    @Override
    public void println() {
        IGenericNode<T> iterator = this.root;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
            System.out.println(iterator.getValue());
        }
    }
}
