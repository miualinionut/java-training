package code._4_student_effort;

class BubleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {
        int size = list.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++)
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
        }
    }

}
