package code._4_student_effort;

import java.sql.SQLOutput;
import java.text.spi.CollatorProvider;

public class Main {

  //metode de instanta -> o recunosc dupa faptul ca NU keyword-ul static
  //metoe ale claselor -> o recunosc dupa keyword-ul static

  public static void main(String[] args) {


    Short [] s = new Short[] {2,3,4};
    MetodeUtile<Short> shorUtils = new MetodeUtile<>();
    shorUtils.bubbleSort(s);
    shorUtils.display(s);

    Integer[] c = new Integer[3];
    c[0] = 3;
    c[1] = 4;
    c[2] = 5;

    //pas1  trebuie sa aloc alt array mai mare daca vreau sa adaug un alt element in array-ul meu
    //colectii



    Integer[] i = new Integer[] {3,2,6};
    //Short[] s = new Short[] {3,2,6};
    Comparable[] hack = i;//polimorfismul nu este intodeauna type safe =>> ma lasa sa il scriu, dar poate sa nu mearga la runtime
    //ca sa ma asigur ca merge si la runtime trebuie sa folosesc generics!!!
    hack[0] = new java.util.Date();

    bubbleSort(i);
    display(i);

    bubbleSort(s);
    display(s);
     //TODO put your code changes in here


    //daca as vrea sa caculez suma dintre 2  + 3 //GENERIC
    long sumaNr = max(2L,3L);
  }


  <T> void m(T a){
    System.out.println(a);
  }

  static <T extends Comparable > T max(T a, T b){
    if(a.compareTo(b) > 0){
      return a;
    }else {
      return b;
    }
  }

  //covarianta = de la parinte la copil =>  este voie; invarianta = invers
  static<T extends Comparable> void bubbleSort(T[] a){//polimorfism // putem folosi generite pt un bubbleSort cu orice fel de tip de date
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

