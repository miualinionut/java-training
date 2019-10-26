package code._1_study._4_try_with_resources;

public class TryWithResources {

  public static void main(String[] args) {
    withFinally();
    tryWithResources();
  }

  private static void withFinally() {
    ClosableResource resource = null;
    try {
      resource = new ClosableResource();
      resource.doWork();
    } finally {
      if (resource != null) {
        resource.close();
      }
    }
  }

  private static void tryWithResources() {
    try (ClosableResource resource = new ClosableResource()) {
      resource.doWork();
    }
  }
}
