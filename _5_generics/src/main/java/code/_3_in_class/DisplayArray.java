package code._3_in_class;

public class DisplayArray {
    public <T extends Comparable>void display(T[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
