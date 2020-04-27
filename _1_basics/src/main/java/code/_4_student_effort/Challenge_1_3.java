package code._4_student_effort;

public class Challenge_1_3 {

    public void countPairs(int[] x){
        boolean[] indexIncluded = new boolean[x.length];
        int pairs=0;
        for (int i = 0; i < x.length-1; i++)
        {
            if (!indexIncluded[i]) {
                for (int j = i + 1; j < x.length; j++) {
                    if (!indexIncluded[j]) {
                        if (x[i] + x[j] == 0) {
                            pairs++;
                            indexIncluded[i] = true;
                            indexIncluded[j] = true;
                        }
                    }
                }
            }
        }
       System.out.println (pairs);
    }

}
