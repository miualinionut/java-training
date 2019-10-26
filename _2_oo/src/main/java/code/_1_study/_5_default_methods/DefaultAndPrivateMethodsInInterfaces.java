package code._1_study._5_default_methods;

public interface DefaultAndPrivateMethodsInInterfaces {

  default int sum(int a, int b) {
    return a + b;
  }

  private int diff(int a, int b) {
    return a - b;
  }
}
