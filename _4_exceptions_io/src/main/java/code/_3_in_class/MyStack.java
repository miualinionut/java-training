package code._3_in_class;

public class MyStack {
  public static void main(String[] args) {
    try {
      a();
    } catch (Exception e) {
      StackTraceElement[] stack = e.getStackTrace();
      for (StackTraceElement element : stack) {
        System.out.println(
                element.getClassName() + "." +
                        element.getMethodName() + " - " +
                        element.getLineNumber());
      }
    }
  }

  private static void a() {
    b();
  }

  private static void b() {
    c();
  }

  private static void c() {
    throw new RuntimeException("my bad ...");
  }
}
