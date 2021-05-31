package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class CodeChallenge4 {

    private int compute(ArrayList<Integer> list) {
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                int pairPosition = list.indexOf(-sum);

                if (pairPosition != -1 && pairPosition != i && pairPosition != j) {
                    removePair(list, i, j, pairPosition);

                    counter++;
                }
            }
        }

        System.out.println("Numarul de perechi este: ");
        return counter;
    }

    private void removePair(ArrayList<Integer> list, int first, int second, int third) {
        System.out.println("Am sters " + list.get(first));
        list.remove(first);

        second--;
        System.out.println("Am sters " + list.get(second));
        list.remove(second);

        third -= 2;
        System.out.println("am sters " + list.get(third));
        list.remove(third);
    }
    public void requirement(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(-1, -1, -1, 2));
        System.out.println(compute(array));
    }
}
