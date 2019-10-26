package code._1_study._1_exceptions;

import java.io.IOException;

public class Exceptions {

  public static void main(String[] args) {
    error();
    checked();
    unchecked();
  }

  private static void error() {
    //An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch.
  }

  private static void checked() {
    try {
      doSomeWorkUsingFiles();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void unchecked() {
    Integer a = null;
    Integer b = 2;

    Integer sum = a + b;
  }

  private static void doSomeWorkUsingFiles() throws IOException {
    throw new IOException("my bad ...");
  }

}
