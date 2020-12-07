package code._4_student_effort.template_method;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list){
        int length = list.length;
        for (int i=0; i<length-1; ++i){
            for (int j=i+1; j<length; ++j)
                if (! numberInCorrectOrder(list[i], list[j])){
                    Integer temp = list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
        }
    }

    abstract boolean numberInCorrectOrder(Integer i1, Integer i2);
}
