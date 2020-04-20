package code._4_student_effort;

public class Pair_of_three {
    public int PairsCount(int[] numbers){
        int nr_pairs = 0, nr_len = numbers.length;
        boolean[] Index = new boolean[nr_len];

        for (int i = 0; i < nr_len - 2; i++)
            for (int j = i + 1; j < nr_len - 1; j++)
                for (int k = j + 1; k < nr_len; k++)
                if (numbers[i] + numbers[j] + numbers[k] == 0 && !Index[i] && !Index[j] && !Index[k]) {
                    Index[i] = Index[j] = Index[k] = true;
                    nr_pairs += 1;
                }

        return nr_pairs;
    }
}
