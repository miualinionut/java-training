package code._4_student_effort;

import java.util.Arrays;

public class pair_of_two {
    public static void main(String[] args) {
        int[] array = {3, 2, -3, -2, 0};
        int sum = 0;
        int contor = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] + array[j] == sum)
                    contor++;
        System.out.println("Numarul de perechi este:" + contor);
    }
}
