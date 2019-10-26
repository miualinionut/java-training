package code._1_study._5_suppressed;

import java.io.IOException;

public class SuppressedExceptions {

  public static void main(String[] args) {
    try {
      methodWithProblems();
    } catch (Exception e) {
      e.printStackTrace(); //where is the initial IOException ?!?!
    }
  }

  private static void methodWithProblems() {
    try {
      throw new IOException("I don't like this file !");
    } catch (IOException e) {
      //System.out.println("IOException caught ...");
      throw new NullPointerException("OOPS NPE !");
    }
  }

}
