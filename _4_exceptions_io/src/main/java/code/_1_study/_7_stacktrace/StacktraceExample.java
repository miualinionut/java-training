package code._1_study._7_stacktrace;

public class StacktraceExample {

  public static void main(String[] args) {
    try {
      a();
    } catch (Exception e) {
      printStacktrace(e);
    }
  }

  private static void a() {
    b();
  }

  private static void b() {
    c();
  }

  private static void c() {
    d();
  }

  private static void d() {
    throw new RuntimeException("my bad...");
  }

  private static void printStacktrace(Exception ex) {
    StackTraceElement elements[] = ex.getStackTrace();
    for (int i = elements.length - 1; i >= 0; i--) {
      System.err.println(elements[i].getFileName()
              + ":" + elements[i].getLineNumber()
              + " >> "
              + elements[i].getMethodName() + "()");
    }

  }
}
