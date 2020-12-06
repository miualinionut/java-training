package code._4_student_effort.Template_Method;

public  abstract class TemplateBubbleSort {
    public void sort(Integer[] list){
        int n = list.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbersInCorrectOrder(list[j], list[j+1]))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
