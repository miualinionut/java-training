package code._4_student_effort;

public class Challenge_1_4 {
    public void countPairs(int[] x){
        boolean[] indexIncluded = new boolean[x.length];
        int pairs=0;
        for (int i = 0; i < x.length-2; i++) {
            if (!indexIncluded[i]) {
                for (int j = i + 1; j < x.length-1; j++) {
                    if (!indexIncluded[j] && !indexIncluded[i]) {
                         for (int k = j + 1; k < x.length; k++) {
                             if (!indexIncluded[k] && !indexIncluded[j] && !indexIncluded[i]) {
                                 if (x[i] + x[j] + x[k] == 0) {
                                     pairs++;
                                     indexIncluded[i] = true;
                                     indexIncluded[j] = true;
                                     indexIncluded[k] = true;
                                 }
                             }
                        }
                    }
                }
            }
        }
        System.out.println (pairs);
    }
}
