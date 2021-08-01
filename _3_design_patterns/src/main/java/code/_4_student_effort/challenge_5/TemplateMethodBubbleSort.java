package code._4_student_effort.challenge_5;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list ){
        for(int i = 0; i< list.length - 1; i++)
            for(int j = i+1; j < list.length; j++){
                if(numbersInCorrectOrder(list[i], list[j]))
                {
                    Integer temp;
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
