package code._4_student_effort;

public class GenericList<T> implements IGenericList<T> {

    private IGenericListNode<T> elem;

    @Override
    public void insert(T element) {
        IGenericListNode<T> next_elem = this.elem;
        while (next_elem.getNext() != null) {
            next_elem = next_elem.getNext();
        }

        IGenericListNode<T> new_elem = new GenericListNode();
        new_elem.setValue(element);
        next_elem.setNext(new_elem);
    }

    @Override
    public void println() {
        IGenericListNode<T> next_elem = this.elem;
        while (next_elem.getNext() != null) {
            next_elem = next_elem.getNext();
            System.out.println(next_elem.getValue());
        }
    }

    public GenericList(T elemValue){
        this.elem = new GenericListNode<>();
        this.elem.setValue(elemValue);
    }

    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();

    }
}

