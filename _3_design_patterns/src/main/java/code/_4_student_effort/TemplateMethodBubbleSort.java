package code._4_student_effort;

public abstract class TemplateMethodBubbleSort {
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);

    public void sort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbersInCorrectOrder(arr[i], arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
