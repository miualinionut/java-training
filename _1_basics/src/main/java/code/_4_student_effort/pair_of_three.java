package code._4_student_effort;

public class pair_of_three {
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, 2};
        int sum = 0;
        int contor = 0;
        int[] v = new int[array.length];
        for (int i = 0; i < array.length; i++)
            v[i] = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++)
                for (int k = j + 1; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == sum)
                        if (v[i] == 0 && v[j] == 0 && v[k] == 0) {
                            v[i] = 1;
                            v[j] = 1;
                            v[k] = 1;
                            contor++;
                        }
        }
        System.out.println("Numarul de perechi este:" + contor);
    }
}

