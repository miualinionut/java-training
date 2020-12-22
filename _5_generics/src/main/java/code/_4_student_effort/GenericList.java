package code._4_student_effort;

public class GenericList<T> implements IGenericList<T> {

    public IGenericNode<T> root;

    public GenericList(T rootVal) {
        this.root = new GenericNode<>();
        this.root.setValue(rootVal);
    }

    public void insert (T element){
        IGenericNode<T> auxNode = this.root;
        while (auxNode.getNext() != null){
            auxNode = auxNode.getNext();
        }
        IGenericNode<T> newNode = new GenericNode();
        newNode.setValue(element);
        auxNode.setNext(newNode);

    }

    public void println(){
        while (root.getNext() != null){
            root = root.getNext();
            System.out.print(root.getValue() + " ");
        }
        System.out.println();
    }
}
