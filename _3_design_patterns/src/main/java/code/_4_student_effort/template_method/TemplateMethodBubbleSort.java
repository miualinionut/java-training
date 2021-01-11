package code._4_student_effort.template_method;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        // bubbleSort algorithm
        boolean isSwapped; // for optimization
        for (int i = 0; i < list.length - 1; i++) {
            isSwapped = false;

            for (int j = 0; j < list.length - i - 1; j++) {
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;

                    isSwapped = true;
                }
            }

            if (isSwapped == false) {
                break;
            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
