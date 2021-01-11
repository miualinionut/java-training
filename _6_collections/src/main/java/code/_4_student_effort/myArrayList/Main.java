package code._4_student_effort.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl<Integer> list = new MyArrayListImpl<>();
        list.add(5);
        list.add(3);
        list.add(19);
        list.add(7);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        list.set(2, 2);
        System.out.println(list.get(list.size() - 1));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
