package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class CodeChallenge3 {

    private int compute(ArrayList<Integer> list) {
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            int pairPosition = list.indexOf(-(list.get(i)));

            if (pairPosition != -1 && pairPosition != i) {
                removePair(list, i, pairPosition);
                counter++;
                i--;
            }
        }
        System.out.println("Numarul de perechi este: ");
        return counter;
    }

    private void removePair(ArrayList<Integer> list, int first, int second) {
        System.out.println("Am sters " + list.get(first));
        list.remove(first);

        second--;
        System.out.println("am sters " + list.get(second));
        list.remove(second);
    }
    public void requirement(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(-1, -1, 1, 2));
        System.out.println(compute(array));
    }
}
