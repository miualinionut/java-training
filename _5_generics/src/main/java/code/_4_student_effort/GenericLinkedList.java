package code._4_student_effort;

public class GenericLinkedList<T> implements IGenericList<T> {

    private IGenericNode<T> rootNode;
    private int size = 0;

    public GenericLinkedList(T rootValue) {
        this.rootNode = new GenericNode<>(rootValue);
        size = 1;
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> trailer = this.rootNode;
        while(trailer.getNext() != null) {
            trailer = trailer.getNext();
        }
        IGenericNode<T> newNode = new GenericNode<>(element);
        newNode.setNext(null);
        trailer.setNext(newNode);
        size++;
    }

    @Override
    public void println() {
        IGenericNode<T> trailer = this.rootNode;
        System.out.print(trailer + " ");
        while (trailer.getNext() != null) {
            trailer = trailer.getNext();
            System.out.print(trailer + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
