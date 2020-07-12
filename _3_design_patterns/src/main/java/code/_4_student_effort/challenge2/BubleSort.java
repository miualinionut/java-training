package code._4_student_effort.challenge2;

public class BubleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {

        int lungime = list.length;

        for (int i = 0; i < lungime - 1; i++) {
            for (int j = 0; j < lungime - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i <= lungime - 1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
