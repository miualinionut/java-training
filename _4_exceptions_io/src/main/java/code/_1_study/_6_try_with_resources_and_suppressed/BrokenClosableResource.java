package code._1_study._6_try_with_resources_and_suppressed;

public class BrokenClosableResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new CustomException("Error when closing ClosableResource");
    }
}