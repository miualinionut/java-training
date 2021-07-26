package code._4_student_effort.CodeChallange9;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> withDups = List.of(1, 1, 2, 1, 3, 2);

        MySet<Integer> mySet = new MySetImpl<>();
        for (Integer i : withDups) {
            mySet.add(i);
        }

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }
    }
}
