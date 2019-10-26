package code._3_in_class;

public class TryWithResources {

  public static void main(String[] args) {

    try (MyClosableResource r = new MyClosableResource()) {
      throw new RuntimeException("oops");
    } catch (Exception e) {
      Throwable[] exceptions = e.getSuppressed();
      for(Throwable exception: exceptions) {
        System.out.println(exception.getMessage());
      }
      System.out.println(e.getMessage());
    }
  }
}
