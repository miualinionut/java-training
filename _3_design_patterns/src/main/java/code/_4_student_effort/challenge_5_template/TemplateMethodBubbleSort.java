package code._4_student_effort.challenge_5_template;

public abstract class TemplateMethodBubbleSort {
    void swap(Integer[] list, int i, int j)
    {
        list[i] += list[j];
        list[j] = list[i] - list[j];
        list[i] = list[i] - list[j];
    }

    void sort(Integer[] list){
        for(int i = 0; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                if(numbersInCorrectOrder(list[i], list[j])){
                    swap(list, i, j);
                }
            }
        }

    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
