package code._4_student_effort.Proxy;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name'" + name + '\'' + ", money =" + money + '}';
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
