package code._4_student_effort.CodeChallange8;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayListImpl<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(9);

        list.set(0, 99);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
