//package code._3_in_class;
//import java.util.Scanner;
//public class Main {
//
//  public static void main(String[] args) {
//
//    //IO - input / output
//    String input;
//    String[] strings = new String[0];
//    MyCollection inputs = new MyCollection(strings);
//
//
//    Scanner scanner = new Scanner(System.in);
//
//    while(!(input = scanner.nextLine()).equalsIgnoreCase("exit")){
//        inputs.addNewElementInCollection(input);
//
//      //System.out.println("### am citit " + input);
//
//     // String[] newInputs = new String[inputs.length + 1];//step 1 allocate more space
//     /* for(int i = 0; i < inputs.length;i++){//step 2 : copy old values to new space //CLASSIC for
//        newInputs[i] = inputs[i];
//      }
//      inputs = newInputs;//step 3: copy new arrat reference to exiting variable
//
//      inputs[inputs.length - 1] = input;
//
//    }
//
//    for(String s: inputs){//For enhanced for - > nu avem acces la index
//
//      System.out.println("###  valoarea citit " + s);
//
//    }*/
//
//
//    //TODO put your code changes in here
//  }
//
//   class MyCollection{
//
//    private  String[] elements;
//    private int currentIndex;
//
//    public MyCollection (String[] elements){
//      this.elements = elements;
//      this.currentIndex = 0;
//    }
//
//    public void addNewElementInCollection(String newElement){
//
//      if(currentIndex < elements.length){//daca nu mai avem saptiu in array alocam mai mult spatiu
//        elements[currentIndex] = newElement;
//      }else{
//        String[] newInputs = new String[elements.length + 1];
//        for(int i = 0; i < elements.length; i++){
//          newInputs[i] = elements[i];
//
//        }
//        elements  = newInputs;
//      }
//      // dupa ce ne-am asigurat ca avem spatiu - adaugam noul element
//      elements[currentIndex] = newElement;
//      currentIndex = currentIndex + 1;
//      //operatie atomica => indivizibila nu se poate descompune in mai multe operatii
//      currentIndex++; //nu este operatie atomica pt ca se implemeteaza in 2 pasi
//      //pas 1 : se creaza o copie a valorii existente
//      //pas 2: se incrementeaza valoarea curenta
//
//    }
//
//  }
//
//}