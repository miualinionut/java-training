package code._4_student_effort.challenge5;

public abstract class TemplateMethodBubbleSort {

    void sort(Integer[] list){
        for (int i=0; i<list.length;i++) {
            for(int j=i+1;j<list.length;j++){
               if(!numbersInCorrectOrder(list[i],list[j])){
                   int aux=list[i];
                   list[i]=list[j];
                   list[j]=aux;
               }
            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1,Integer i2);

}
