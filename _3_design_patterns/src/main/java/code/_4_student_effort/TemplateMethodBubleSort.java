package code._4_student_effort;

public abstract class TemplateMethodBubleSort {
    public void sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbersInCorrectOrder(list[i], list[j])) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
