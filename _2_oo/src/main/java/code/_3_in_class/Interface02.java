package code._3_in_class;

public interface Interface02 {
    default void m()
    {
        System.out.println("hello world from m()");
    }
    default void m02()
    {
        System.out.println("hello world from m02()");
    }
}
