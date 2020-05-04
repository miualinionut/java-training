package code._4_student_effort.Builder;

public class BuilderClass {

    void build(String name)
    {
        Person p=new Person(name);
    }

    void build(String name, String job)
    {
        Person p=new Person(name,job);
    }

    void build(String name, String job, String university)
    {
        Person p=new Person(name,job,university);
    }
}
