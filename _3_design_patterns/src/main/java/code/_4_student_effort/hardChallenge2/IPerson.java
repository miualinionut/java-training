package code._4_student_effort.hardChallenge2;

public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();
}