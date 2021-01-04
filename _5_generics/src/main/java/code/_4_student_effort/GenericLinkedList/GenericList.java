package code._4_student_effort.GenericLinkedList;

public class GenericList<T> implements IGenericList<T> {
    private GenericNode<T> root = null;

    public GenericList(T root){
        this.root = new GenericNode<>();
        this.root.setValue(root);
    }

    @Override
    public void insert(T element){
       IGenericNode<T> iterator = this.root;
       while(iterator.getNext()!= null){
           iterator = iterator.getNext();
       }
       GenericNode<T> newNode = new GenericNode<>();
       newNode.setValue(element);
       iterator.setNext(newNode);
    }

    @Override
    public void println(){
        IGenericNode<T> iterator = root;
        while(iterator.getNext()!=null){
            iterator = iterator.getNext();
            System.out.println(iterator.getValue());
        }
    }
}
