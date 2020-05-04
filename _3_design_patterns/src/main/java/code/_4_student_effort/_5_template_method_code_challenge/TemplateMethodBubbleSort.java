package code._4_student_effort._5_template_method_code_challenge;

abstract class TemplateMethodBubbleSort {

    void sort(Integer[] list) {
        Integer aux;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (!numbersInCorrectOrder(list[i], list[j])) {
                    aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
