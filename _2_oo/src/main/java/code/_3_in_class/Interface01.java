package code._3_in_class;

public interface Interface01 {
    default void m()
    {
        System.out.println("hello world from m()");
    }
    default void m01()
    {
        System.out.println("hello world from m01()");
    }
}
