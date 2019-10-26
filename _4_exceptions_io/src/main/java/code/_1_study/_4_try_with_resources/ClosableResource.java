package code._1_study._4_try_with_resources;

public class ClosableResource implements AutoCloseable {
  @Override
  public void close() {
    System.out.println("memory allocation for this resource is now free");
  }

  public void doWork() {
    System.out.println("resource is working hard ...");
  }
}