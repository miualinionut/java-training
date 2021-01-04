package code._4_student_effort._1_leaders;

import java.util.List;

public class Leaders {
    Integer[] array;

    public Leaders(List<Integer> array) {
        this.array = array.toArray(new Integer[0]);
    }

    public void findLeaders() {
        boolean isLeader;
        int leader;
        for (int i = 0; i < array.length; i++) {
            isLeader = true;
            leader = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (leader < array[j]) {
                    isLeader = false;
                    i = j - 1;
                    break;
                }
            }
            if (isLeader)
                System.out.println(leader);
        }
    }
}
