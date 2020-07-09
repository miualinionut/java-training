package code._4_student_effort.Challenge9;

public class Test {

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySetImpl(10);
        mySet.add(2);
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
        System.out.println(mySet.size()); //2

        System.out.println(mySet.contains(2));
        mySet.set(0,7);
        mySet.set(1,7);
        System.out.println(mySet.get(0));
        System.out.println(mySet.get(1)); // tot 1 ramane
       // mySet.get(12);
        mySet.set(19,2);
    }
}
