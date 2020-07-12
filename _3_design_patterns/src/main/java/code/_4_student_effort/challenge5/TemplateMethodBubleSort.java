package code._4_student_effort.challenge5;

public abstract class TemplateMethodBubleSort {

    void sort(Integer[] list){
        Integer aux;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - i; j++){
                if(numbersInCorrectOrder(list[j],list[j+1])){
                    aux = list[j];
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
        }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
