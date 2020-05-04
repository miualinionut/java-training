package code._4_student_effort._5_template_method;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    list[j] = list[j] + list[j + 1];
                    list[j + 1] = list[j] - list[j + 1];
                    list[j] = list[j] - list[j + 1];
                }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
