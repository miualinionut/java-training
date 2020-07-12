package code._4_student_effort;

public class MetodeUtile<T extends Comparable> {


    public void bubbleSort(T[] a){//polimorfism // putem folosi generite pt un bubbleSort cu orice fel de tip de date
        for(int i = 0; i < a.length - 1; i++){//Nu conteaza ce nume are T putem pune ce nume vreau in implemementarea de generice
            for(int j = i+1; j < a.length; j++){
                if(a[i].compareTo(a[j]) > 0){
                    T temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
    static void display(Object[] a){
        for(Object i : a){
            System.out.print(i+ " ");
        }
        System.out.println();
    }


}
