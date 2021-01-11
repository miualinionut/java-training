package code._3_in_class;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main <MC>{
  private MC t;
  public static void main(String[] args) {

    Main type = new Main();
    type.setT("D");
    type.setT(10);
  }

  public MC getT() {
    return t;
  }

  public void setT(MC t) {
    this.t = t;
  }
}
