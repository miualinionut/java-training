package code._4_student_effort;

public class Pair_of_two {
    public int PairsCount(int[] numbers){
        int nr_pairs = 0, nr_len = numbers.length;
        boolean[] Index = new boolean[nr_len];

        for (int i = 0; i < nr_len - 1; i++)
            for (int j = i + 1; j < nr_len; j++)
                if (numbers[i] + numbers[j] == 0 && !Index[i] && !Index[j]) {
                    Index[i] = Index[j] = true;
                    nr_pairs += 1;
                }

        return nr_pairs;
    }
}
