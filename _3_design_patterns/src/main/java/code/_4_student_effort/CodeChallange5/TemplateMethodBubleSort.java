package code._4_student_effort.CodeChallange5;

public abstract class TemplateMethodBubleSort {

    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (numbersInCorrectOrder(list[i], list[j])) {
                    Integer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
