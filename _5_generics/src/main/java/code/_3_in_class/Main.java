package code._3_in_class;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        DisplayArray displayArray = new DisplayArray();

        Integer[] i = new Integer[] {3,2,6,7,6,8,15,21,20};
        Short[] s = new Short[] {3,2,6,8,1,7};
        Byte[] b = new Byte[] {3,2,6,8,7,9};
        Double[] d = new Double[] {3d,2d,6d,5d,4d,9d,8d};

        System.out.println("i before sorted: ");
        displayArray.display(i);
        System.out.println("i after sorted: ");
        bubbleSort.sort(i);
        displayArray.display(i);

        System.out.println("s before sorted: ");
        displayArray.display(s);
        System.out.println("s after sorted: ");
        bubbleSort.sort(s);
        displayArray.display(s);

        System.out.println("b before sorted: ");
        displayArray.display(b);
        System.out.println("b after sorted: ");
        bubbleSort.sort(b);
        displayArray.display(b);

        System.out.println("d before sorted: ");
        displayArray.display(d);
        System.out.println("d after sorted: ");
        bubbleSort.sort(d);
        displayArray.display(d);
    }

}