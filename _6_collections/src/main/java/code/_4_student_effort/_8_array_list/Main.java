package code._4_student_effort._8_array_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> ints = new ArrList<>();
        ints.add(5);
        ints.add(3);
        ints.add(2);
        ints.add(1);
        for(int i = 0; i < ints.size(); i++){
            System.out.println(ints.get(i));
        }
        ints.remove(3);
        System.out.println();
        for(int i = 0; i < ints.size(); i++){
            System.out.println(ints.get(i));
        }
    }
}
