package code._4_student_effort;

public class Student {
    private final String _name;
    private final int _money;

    public Student(String _name, int _money) {
        this._name = _name;
        this._money = _money;
    }

    public String get_name() {
        return _name;
    }

    public int get_money() {
        return _money;
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + _name + '\'' + ", money=" + _money + '}';
    }
}
