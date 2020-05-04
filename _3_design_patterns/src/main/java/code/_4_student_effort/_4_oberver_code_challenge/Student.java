package code._4_student_effort._4_oberver_code_challenge;

class Student implements Observer {

    private final String name;

    Student(String name) {
        this.name = name;
    }

    void listenTo (Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}
