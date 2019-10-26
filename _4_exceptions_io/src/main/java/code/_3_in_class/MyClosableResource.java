package code._3_in_class;

public class MyClosableResource implements AutoCloseable {
  @Override
  public void close() throws Exception {
    throw new RuntimeException("bad closing!!!");
  }
}
