package code._4_student_effort._1_leaders;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 9, 8, 7, 11, 6);
        Leaders leaders = new Leaders(numbers);
        leaders.findLeaders(); //Another class method


        // All in main method
        /*
        System.out.println();
        boolean isLeader;
        int leader;
        int arrSize = numbers.size();
        for (int i = 0; i < arrSize; i++) {
            isLeader = true;
            leader = numbers.get(i);
            for (int j = i + 1; j < arrSize; j++) {
                if (leader < numbers.get(j)) {
                    isLeader = false;
                    i = j - 1;
                    break;
                }
            }
            if (isLeader)
                System.out.println(leader);
        }
        */
    }
}
