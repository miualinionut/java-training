package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    Integer[] ints = {1, 2, 3, 4, 5};
    Short[] shorts = {1, 2, 4, 8, 5};
    sortAscending(ints);
    display(ints);
  }


  private static void sortAscending(Comparable[] ints) {
    for (int i = 0; i < ints.length - 1; i++) {
      for (int j = i + 1; j <= ints.length; j++)
        if (ints[i].compareTo(ints[j]) > 0) {
          Comparable aux = ints[i];
          ints[i] = ints[j];
          ints[j] = aux;

        }
    }
  }

  private static void display(Comparable[] ints) {
    System.out.println("");
    for (Comparable e : ints) {
      System.out.print(e + " ");
    }
  }

}