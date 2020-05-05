package code._4_student_effort.Challenge_5_Template_method;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list) {
        int esortat, i, aux;
        do {
            esortat = 1;
            for (i = 0; i < list.length - 1; i++)
                if (numbersInCorrectOrder(list[i],list[i + 1])) {
                    esortat = 0;
                    aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                }
        } while (esortat == 0);
    }


    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
