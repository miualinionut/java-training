package code._4_student_effort;

public class GenericNode<T> implements  IGenericNode<T>{
     public T value;
     public IGenericNode<T> next;

     public GenericNode (){
         this.value = null;
     }

    public GenericNode(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
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
    public void setNext(IGenericNode<T> nextNode){
        this.next = nextNode;

    }

}
