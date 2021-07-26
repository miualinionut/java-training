package code._4_student_effort.HardCodeChallange2;

public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();
}
