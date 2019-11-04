package code._1_study._5_default_methods;

public interface DefaultAndPrivateMethodsInInterfaces {

  default int sum(int a, int b) {
    return a + b;
  }

  default int difference(int a, int b) {
    return diff(a,b);
  }

  private int diff(int a, int b) {
    return a - b;
  }
}

class DefaultMethods implements DefaultAndPrivateMethodsInInterfaces {

  public static void main(String[] args) {
    DefaultMethods defaultMethods = new DefaultMethods();
    System.out.println(defaultMethods.sum(2,1));
    System.out.println(defaultMethods.difference(2,1));
    //defaultMethods.diff(2,1); because this is private it is visible only inside the interface
  }
}