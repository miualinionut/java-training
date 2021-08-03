package code._4_student_effort.hard;




public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();
}
