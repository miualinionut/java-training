package code._3_in_class;

public class Main {
  public static void main(String[] args) {
    fizz1();
  }

  public static void fizz1() {
    StringBuilder finalString = new StringBuilder();
    boolean checkIfDiv = false;

    wordNumber[] elements = {
            new wordNumber(3,"Fizz"),
            new wordNumber(5,"Buzz"),
            new wordNumber(7, "Rizz"),
            new wordNumber(11,"Jazz"),
    };

    for(short i = 1; i <= 100; i++) {
      for (wordNumber counter : elements) {
        if (i % counter.getNumber() == 0) {
          checkIfDiv = true;
          String string = counter.getWord() + ", ";
          finalString.append(string);
        }
      }
      if (!checkIfDiv) {
        String string = String.valueOf(i) + ", ";
        finalString.append(string);
      }
    }
    System.out.println(finalString);
  }
}