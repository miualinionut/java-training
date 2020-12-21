package code._4_student_effort;


public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int index = 0;

    public  ArrayIterator(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasnext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while(it.hasnext()){
            System.out.println(it.next());
        }


        Socks[] socks = new Socks[10];
        Gloves[] gloves = new Gloves[10];
        for (int i = 0; i < 10; i++) {
            socks[i] = new Socks("red", i+1);
            gloves[i] = new Gloves("blue", i+1);
        }

        IArrayIterator<Socks> socksIterator = new ArrayIterator<>(socks);
        while (socksIterator.hasnext()) {
            System.out.println(socksIterator.next());
        }

        IArrayIterator<Gloves> glovesIterator = new ArrayIterator<>(gloves);
        while (glovesIterator.hasnext()) {
            System.out.println(glovesIterator.next());
        }
    }
}
