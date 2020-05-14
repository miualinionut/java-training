package code._3_in_class;

public class Student {

    private final String name;

    protected Student(String name) {
        this.name = name;
    }

    public static Student make(String name) {
        if (name.equals("popescu")) {
            return new VipStudent(name);
        } else {
            return new Student(name);
        }
    }
}
