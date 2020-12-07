package code._4_student_effort.TemplateMethod;

public abstract class TemplateMethodBubleSort {
    public void sort(Integer [] list){
        for(int i = 0;i < list.length; i++){
            for(int j = i + 1; j < list.length;j++){
                if(numbersInCorrectOrder(list[i],list[j])){
                    Integer aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }

    }

    public abstract boolean numbersInCorrectOrder(Integer i1,Integer i2);
}
