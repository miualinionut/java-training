package code._4_student_effort;

import java.util.Arrays;

public class pair_of_two {
    public static void main(String[] args) {
        int[] array = {3, 2, -3, -2, 3, 0};
        int sum = 0;
        int contor = 0;
        int[] v = new int[array.length];
        for (int i = 0; i < array.length; i++)
            v[i] = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] + array[j] == sum)
                    if (v[i] == 0 && v[j] == 0) {
                        v[i] = 1;
                        v[j] = 1;
                        contor++;
                    }
        }
        System.out.println("Numarul de perechi este:" + contor);
    }
}
